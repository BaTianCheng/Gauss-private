package com.esb.guass.server.base;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Resource;

import org.redkale.convert.json.JsonConvert;
import org.redkale.convert.json.JsonFactory;
import org.redkale.net.http.HttpRequest;
import org.redkale.net.http.HttpResponse;
import org.redkale.net.http.HttpServlet;

import com.esb.guass.common.constant.ConfigConstant;
import com.esb.guass.common.constant.StatusConstant;
import com.esb.guass.common.util.DateTimeUtils;
import com.esb.guass.dispatcher.entity.RequestEntity;
import com.esb.guass.dispatcher.service.RequestService;
import com.esb.guass.server.entity.ResponseResult;

/**
 * Serlvet基类
 * @author wicks
 */
public class BaseSerlvet extends org.redkale.net.http.HttpBaseServlet {

    protected final Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    protected final boolean info = logger.isLoggable(Level.INFO);

    @Resource(name = "APP_TIME") 
    protected long serverCreateTime;

    @Resource 
    protected JsonConvert jsonConvert;

    @Resource 
    protected JsonFactory jsonFactory;

    //当前进程的根目录
    @Resource(name = "APP_HOME")
    protected File home;

    //当前Http Server的web页面的根目录
    @Resource(name = "SERVER_ROOT")
    protected File webroot;

    /**
     * 前置拦截器
     */
    @Override
    public void preExecute(final HttpRequest request, final HttpResponse response, HttpServlet next) throws IOException {
    	//记录所有请求
        if (info) response.setRecycleListener((req, resp) -> {
        	long e = System.currentTimeMillis() - request.getCreatetime();
        	logger.info("["+request.getCreatetime()+"]请求耗时" + e + " 毫秒. 请求为: " + req);
        });
        next.execute(request, response);
    }

    /**
     * 鉴权方法，目前不鉴权
     */
    @Override
    public void authenticate(int moduleid, int actionid, HttpRequest request, HttpResponse response, HttpServlet next) throws IOException {
        next.execute(request, response);
    }
    
    /**
     * 成功输出
     * @param resp
     * @param data
     */
    public void writeSuccessResult(HttpResponse resp, Object data){
    	ResponseResult result = new ResponseResult();
    	result.setStatusCode(StatusConstant.CODE_200);
    	result.setMessage(StatusConstant.CODE_200_MSG);
    	result.setData(data);
    	resp.addHeader("Access-Control-Allow-Origin", "*");
    	resp.finishJson(result);
    }
    
    /**
     * 成功输出
     * @param resp
     * @param data
     * @param msg
     * @param questId
     */
    public void writeSuccessResult(HttpResponse resp, Object data, String msg, String questId){
    	ResponseResult result = new ResponseResult();
    	result.setStatusCode(StatusConstant.CODE_200);
    	result.setMessage(msg);
    	result.setQuestId(questId);
    	result.setData(data);
    	resp.addHeader("Access-Control-Allow-Origin", "*");
    	resp.finishJson(result);
    }
    
    /**
     * 失败输出
     * @param resp
     * @param code
     * @param msg
     * @param data
     */
    public void writeErrorResult(HttpResponse resp, String code, String msg, Object data){
    	ResponseResult result = new ResponseResult();
    	result.setStatusCode(code);
    	result.setMessage(msg);
    	result.setData(data);
    	resp.addHeader("Access-Control-Allow-Origin", "*");
    	resp.finishJson(result);
    }
    
    /**
     * 同步获取结果
     * @param requestEntity
     * @return
     */
    public RequestEntity getSyncResult(String questId){
    	RequestEntity entity = null;
    	int beiginTime = DateTimeUtils.getCurrentTimeStamp();
		while((beiginTime-DateTimeUtils.getCurrentTimeStamp()) < ConfigConstant.RETURNRESULTDATA_MAXTIME){
			try {
				Thread.sleep(ConfigConstant.RETURNRESULTDATA_INTERVAL);
			} catch (InterruptedException e) {
				break;
			}
			entity = RequestService.find(questId);
			if(entity.getStatus().equals(StatusConstant.CODE_1203)){
				return entity;
			}
		}
		return entity;
    }
}

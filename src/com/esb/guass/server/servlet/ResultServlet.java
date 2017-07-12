package com.esb.guass.server.servlet;

import java.io.IOException;

import org.redkale.net.http.HttpRequest;
import org.redkale.net.http.HttpResponse;
import org.redkale.net.http.WebServlet;

import com.esb.guass.common.constant.StatusConstant;
import com.esb.guass.dispatcher.entity.RequestEntity;
import com.esb.guass.dispatcher.service.RequestService;
import com.esb.guass.server.base.BaseSerlvet;
import com.google.common.base.Strings;

@WebServlet(value = {"/results/*"}, comment = "ESB服务管理")
public class ResultServlet extends BaseSerlvet {
    
    /**
     * 结果查询服务
     * @param req
     * @param resp
     * @throws IOException
     */
    @AuthIgnore
    @WebMapping(url = "/results/get", comment = "HTTP代理发送请求服务")
    @WebParam(name = "questId", type = String.class, comment = "请求任务编号")
    @WebParam(name = "businessId", type = String.class, comment = "业务编号")
    public void getResult(HttpRequest req, HttpResponse resp) throws IOException {
    	if((Strings.isNullOrEmpty(req.getParameter("questId")) && Strings.isNullOrEmpty(req.getParameter("businessId")))){
    		this.writeErrorResult(resp, StatusConstant.CODE_400, StatusConstant.CODE_400_MSG, null);
    	} else {
    		if(!Strings.isNullOrEmpty(req.getParameter("questId"))){
    			RequestEntity requestEntity = RequestService.find(req.getParameter("questId"));
    			if(requestEntity!=null){
    				this.writeSuccessResult(resp, requestEntity.getResult(), StatusConstant.CODE_200_MSG, requestEntity.getQuestId());
    			} else {
    				this.writeErrorResult(resp, StatusConstant.CODE_500, "系统异常，数据库无记录", null);
    			}
    		} else {
    			//根据businessId获取数据
    			
    		}
    	}
    }
}

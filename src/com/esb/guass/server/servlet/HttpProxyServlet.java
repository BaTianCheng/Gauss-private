package com.esb.guass.server.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.redkale.net.http.HttpRequest;
import org.redkale.net.http.HttpResponse;
import org.redkale.net.http.WebServlet;

import com.alibaba.fastjson.JSON;
import com.esb.guass.common.constant.ConfigConstant;
import com.esb.guass.common.constant.HttpConstant;
import com.esb.guass.common.constant.StatusConstant;
import com.esb.guass.common.util.DateTimeUtils;
import com.esb.guass.dispatcher.entity.RequestEntity;
import com.esb.guass.dispatcher.entity.RequestOption;
import com.esb.guass.dispatcher.service.RequestQueue;
import com.esb.guass.dispatcher.service.RequestService;
import com.esb.guass.server.base.BaseSerlvet;
import com.google.common.base.Strings;

/**
 * Htpp代理服务
 * @author wicks
 */
@WebServlet(value = {"/proxys/*"}, comment = "Htpp代理服务")
public class HttpProxyServlet extends BaseSerlvet {

    /**
     * HTTP代理发送请求服务
     * @param req
     * @param resp
     * @throws IOException
     */
    @AuthIgnore
    @WebMapping(url = "/proxys/request", comment = "HTTP代理发送请求服务")
    @WebParam(name = "url", type = String.class, comment = "请求转发的URL")
    @WebParam(name = "data", type = String.class, comment = "请求转发的数据")
    @WebParam(name = "identification", type = String.class, comment = "身份识别码")
    public void request(HttpRequest req, HttpResponse resp) throws IOException {
    	if(Strings.isNullOrEmpty(req.getParameter("url")) || Strings.isNullOrEmpty(req.getParameter("data")) || Strings.isNullOrEmpty(req.getParameter("identification") )){
    		this.writeErrorResult(resp, StatusConstant.CODE_400, StatusConstant.CODE_400_MSG, null);
    	} else {
    		RequestEntity requestEntity = new RequestEntity();
    		RequestOption option = new RequestOption();
    		requestEntity.setQuestId(UUID.randomUUID().toString());
    		requestEntity.setUrl(req.getParameter("url"));
    		requestEntity.setIdentification(req.getParameter("identification"));
    		@SuppressWarnings("unchecked")
			Map<String, String> params = JSON.parseObject(req.getParameter("data"), HashMap.class);
    		requestEntity.setParams(params);
    		
    		if(!Strings.isNullOrEmpty(req.getParameter("businessId"))){
    			option.setBusinessId("businessId");
    		} 
    		
    		if(Strings.isNullOrEmpty(req.getParameter("charset"))){
    			option.setCharset(HttpConstant.DEFAULT_CHARSET);
    		} else {
    			option.setCharset(req.getParameter("charset"));
    		}
    		
    		if(Strings.isNullOrEmpty(req.getParameter("method"))){
    			option.setMethod(HttpConstant.DEFAULT_METHOD);
    		} else {
    			option.setMethod(req.getParameter("method"));
    		}
    		
    		option.setBody(req.getBooleanParameter("isbody", false));

    		if(!Strings.isNullOrEmpty(req.getParameter("id"))){
    			option.setBusinessId(req.getParameter("id"));
    		}
    		
    		if(!Strings.isNullOrEmpty(req.getParameter("head"))){
    			@SuppressWarnings("unchecked")
    			Map<String, String> head = JSON.parseObject(req.getParameter("head"), HashMap.class);
        		option.setHead(head);
    		}
    		
    		requestEntity.setRequestIP(req.getHost());
    		requestEntity.setRequestTime(req.getCreatetime());
    		requestEntity.setRequestOption(option);
    		requestEntity.setStatus(StatusConstant.CODE_1201_MSG);
    		RequestQueue.add(requestEntity);
    		RequestService.insert(requestEntity);
    		
    		//判断是否立刻返回结果
    		if(Strings.isNullOrEmpty(req.getParameter("getResultData"))){
    			this.writeSuccessResult(resp, null, StatusConstant.CODE_200_MSG, requestEntity.getQuestId());
    		} else {
    			int beiginTime = DateTimeUtils.getCurrentTimeStamp();
    			while((beiginTime-DateTimeUtils.getCurrentTimeStamp()) < ConfigConstant.RETURNRESULTDATA_MAXTIME){
    				try {
						Thread.sleep(ConfigConstant.RETURNRESULTDATA_INTERVAL);
					} catch (InterruptedException e) {
						e.printStackTrace();
						break;
					}
    				RequestEntity entity = RequestService.find(requestEntity.getQuestId());
    				if(entity.getStatus().equals(StatusConstant.CODE_1203)){
    					this.writeSuccessResult(resp, entity.getResult(), StatusConstant.CODE_200_MSG, entity.getQuestId());
    					return;
    				}
    				
    			}
    			this.writeSuccessResult(resp, null, StatusConstant.CODE_200_MSG, requestEntity.getQuestId());
    		}
    		
    		
    		
    	}
    }
    
}

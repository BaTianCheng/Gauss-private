package com.esb.guass.server.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.redkale.net.http.HttpRequest;
import org.redkale.net.http.HttpResponse;
import org.redkale.net.http.WebServlet;

import com.alibaba.fastjson.JSON;
import com.esb.guass.common.constant.StatusConstant;
import com.esb.guass.dispatcher.service.ServiceMangerService;
import com.esb.guass.server.base.BaseSerlvet;
import com.google.common.base.Strings;

@WebServlet(value = {"/services/*"}, comment = "ESB服务管理")
public class ServiceServlet extends BaseSerlvet {

	/**
     * ESB服务请求
     * @param req
     * @param resp
     * @throws IOException
     */
    @AuthIgnore
    @WebMapping(url = "/services/get", comment = "获取ESB服务项")
    public void getService(HttpRequest req, HttpResponse resp) throws IOException {
    	if(Strings.isNullOrEmpty(req.getParameter("serviceName")) || Strings.isNullOrEmpty(req.getParameter("identification"))){
    		this.writeErrorResult(resp, StatusConstant.CODE_400, StatusConstant.CODE_400_MSG, null);
    	} else {
    		String serviceName = req.getParameter("serviceName");
    		
    		//解析参数(多参数数组形式只解析第一个参数，如a=1&a=2，只解析a=1)
    		Map<String, String> params = new HashMap<>();
    		if(!Strings.isNullOrEmpty(req.getParameter("data"))){
    			@SuppressWarnings("unchecked")
    			Map<String, String> paramDatas = JSON.parseObject(req.getParameter("data"), HashMap.class);
    			params.putAll(paramDatas);
    		}
    		for(String paramName : req.getParameterNames()){
    			if(!paramName.equals("serviceName") && !paramName.equals("identification")){
    				params.put(paramName, req.getParameter(paramName));
    			}
    		}
    		
    		String questId = ServiceMangerService.sendService(serviceName, req.getParameter("identification"), params);
    		this.writeSuccessResult(resp, null, StatusConstant.CODE_200_MSG, questId);
    	}
    }
    
}

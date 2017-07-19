package com.esb.guass.server.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.redkale.net.http.HttpRequest;
import org.redkale.net.http.HttpResponse;
import org.redkale.net.http.WebServlet;

import com.alibaba.fastjson.JSON;
import com.esb.guass.common.constant.StatusConstant;
import com.esb.guass.dispatcher.entity.RequestEntity;
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
    	if(Strings.isNullOrEmpty(req.getParameter("serviceCode"))){
    		this.writeErrorResult(resp, StatusConstant.CODE_400, StatusConstant.CODE_400_MSG, null);
    	} else {
    		String serviceCode = req.getParameter("serviceCode");
    		//解析参数(多参数数组形式只解析第一个参数，如a=1&a=2，只解析a=1)
    		Map<String, String> params = new HashMap<>();
    		if(!Strings.isNullOrEmpty(req.getParameter("data"))){
    			@SuppressWarnings("unchecked")
    			Map<String, String> paramDatas = JSON.parseObject(req.getParameter("data"), HashMap.class);
    			params.putAll(paramDatas);
    		}
    		for(String paramName : req.getParameterNames()){
    			if(!paramName.equals("serviceCode") && !paramName.equals("identification")){
    				params.put(paramName, req.getParameter(paramName));
    			}
    		}
    		
    		Map<String, String> head = new HashMap<>();
    		head.put("content-type", req.getContentType());
			if(req.getHeaderNames() != null){
				for(String headName : req.getHeaderNames()){
					head.put(headName, req.getHeader(headName));
				}
			}
    		
			RequestEntity requestEntity = ServiceMangerService.sendService(serviceCode, "", params, head, req);
			
			//判断服务是否存在
			if(requestEntity == null){
				this.writeErrorResult(resp, StatusConstant.CODE_310, StatusConstant.CODE_310_MSG, null);
				return;
			}
			
			//判断是否异步
    		if(requestEntity.isAsync()){
    			this.writeSuccessResult(resp, null, StatusConstant.CODE_200_MSG, requestEntity.getQuestId());
    		} else {
    			RequestEntity entity = getSyncResult(requestEntity.getQuestId());
    			if(entity == null){
    				this.writeErrorResult(resp, StatusConstant.CODE_500, StatusConstant.CODE_500_MSG, requestEntity);
    			}else if(entity.getStatus().equals(StatusConstant.CODE_1203)){
    				this.writeText(resp, entity.getResult(), entity.getResponseHeaders());
    			} else {
    				if(Strings.isNullOrEmpty(entity.getResponseErrorMsg())){
    					this.writeErrorResult(resp, requestEntity.getStatus(), "结果无法返回", requestEntity.getQuestId());
    				} else {
    					this.writeText(resp, entity.getResult(), entity.getResponseHeaders());
    				}
    			}
    		}
    	}
    }
    
    /**
     * ESB服务请求(自动路径)
     * @param req
     * @param resp
     * @throws IOException
     */
    @AuthIgnore
    @WebMapping(url = "/services/auto/", comment = "获取ESB服务项")
    public void getServiceByPath(HttpRequest req, HttpResponse resp) throws IOException {
    	String[] pathSplits = req.getRequestURI().split("/services/auto");
    	if(pathSplits!=null && pathSplits.length>=2){
    		String serviceCode = pathSplits[1];
    		//解析参数(多参数数组形式只解析第一个参数，如a=1&a=2，只解析a=1)
    		Map<String, String> params = new HashMap<>();
    		if(!Strings.isNullOrEmpty(req.getParameter("data"))){
    			@SuppressWarnings("unchecked")
    			Map<String, String> paramDatas = JSON.parseObject(req.getParameter("data"), HashMap.class);
    			params.putAll(paramDatas);
    		}
    		for(String paramName : req.getParameterNames()){
    			if(!paramName.equals("serviceCode") && !paramName.equals("identification")){
    				params.put(paramName, req.getParameter(paramName));
    			}
    		}
    		
    		Map<String, String> head = new HashMap<>();
    		head.put("content-type", req.getContentType());
			if(req.getHeaderNames() != null){
				for(String headName : req.getHeaderNames()){
					head.put(headName, req.getHeader(headName));
				}
			}
    		
			RequestEntity requestEntity = ServiceMangerService.sendService(serviceCode, "", params, head, req);
			
			//判断服务是否存在
			if(requestEntity == null){
				this.writeErrorResult(resp, StatusConstant.CODE_310, StatusConstant.CODE_310_MSG, null);
				return;
			}
			
			//判断是否异步
    		if(requestEntity.isAsync()){
    			this.writeSuccessResult(resp, null, StatusConstant.CODE_200_MSG, requestEntity.getQuestId());
    		} else {
    			RequestEntity entity = getSyncResult(requestEntity.getQuestId());
    			if(entity == null){
    				this.writeErrorResult(resp, StatusConstant.CODE_500, StatusConstant.CODE_500_MSG, requestEntity);
    			}else if(entity.getStatus().equals(StatusConstant.CODE_1203)){
    				this.writeText(resp, entity.getResult(), entity.getResponseHeaders());
    			} else {
    				this.writeSuccessResult(resp, null, StatusConstant.CODE_201_MSG, requestEntity.getQuestId());
    			}
    		}
    	} else {
    		this.writeErrorResult(resp, StatusConstant.CODE_310, StatusConstant.CODE_310_MSG, null);
    	}
    }
    
}

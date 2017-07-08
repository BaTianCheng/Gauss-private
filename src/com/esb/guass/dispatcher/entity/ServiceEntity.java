package com.esb.guass.dispatcher.entity;

import java.util.List;

import com.alibaba.fastjson.JSON;

/**
 * 服务实体类
 * @author wicks
 */
public class ServiceEntity {
	
	private String serviceName;
	
	private String mapUrl;
	
	private RequestOption requestOption;
	
	private List<String> params;
	
	private List<String> requiredParams;

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getMapUrl() {
		return mapUrl;
	}

	public void setMapUrl(String mapUrl) {
		this.mapUrl = mapUrl;
	}

	public RequestOption getRequestOption() {
		return requestOption;
	}

	public void setRequestOption(RequestOption requestOption) {
		this.requestOption = requestOption;
	}

	public List<String> getParams() {
		return params;
	}

	public void setParams(List<String> params) {
		this.params = params;
	}

	public List<String> getRequiredParams() {
		return requiredParams;
	}

	public void setRequiredParams(List<String> requiredParams) {
		this.requiredParams = requiredParams;
	}
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}

}

package com.esb.guass.dispatcher.entity;

import java.util.List;

import com.alibaba.fastjson.JSON;

/**
 * 服务实体类
 * @author wicks
 */
public class ServiceEntity {
	
	/**
	 * 服务名称
	 */
	private String serviceName;
	
	/**
	 * 映射路径
	 */
	private String mapUrl;
	
	/**
	 * 异步标志
	 */
	private boolean async;
	
	/**
	 * 请求选项
	 */
	private RequestOption requestOption;
	
	/**
	 * 参数列表
	 */
	private List<String> params;
	
	/**
	 * 必填参数列表
	 */
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

	public boolean isAsync() {
		return async;
	}

	public void setAsync(boolean async) {
		this.async = async;
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
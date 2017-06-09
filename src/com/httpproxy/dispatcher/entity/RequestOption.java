package com.httpproxy.dispatcher.entity;

import java.util.Map;

import com.alibaba.fastjson.JSON;

public class RequestOption {
	
	private String charset;
	
	private String method;
	
	private Map<String, String> head;
	
	private boolean isBody;
	
	private Integer timeOut;
	
	private String businessId;

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Map<String, String> getHead() {
		return head;
	}

	public void setHead(Map<String, String> head) {
		this.head = head;
	}

	public boolean isBody() {
		return isBody;
	}

	public void setBody(boolean isBody) {
		this.isBody = isBody;
	}

	public Integer getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(Integer timeOut) {
		this.timeOut = timeOut;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
	
}

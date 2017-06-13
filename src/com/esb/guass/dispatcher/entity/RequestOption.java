package com.esb.guass.dispatcher.entity;

import java.util.Map;

import com.alibaba.fastjson.JSON;

/**
 * 请求选项
 * @author wicks
 */
public class RequestOption {
	
	/**
	 * 字符集
	 */
	private String charset;
	
	/**
	 * 方法
	 */
	private String method;
	
	/**
	 * 头部数据
	 */
	private Map<String, String> head;
	
	/**
	 * 是否体传递
	 */
	private boolean isBody;
	
	/**
	 * 超时时间
	 */
	private Integer timeOut;
	
	/**
	 * 业务编号
	 */
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

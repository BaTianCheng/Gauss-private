package com.esb.guass.dispatcher.entity;

import java.util.Map;

import com.alibaba.fastjson.JSON;

/**
 * 请求业务实例
 * @author wicks
 */
public class RequestEntity {
	
	/**
	 * 任务编号
	 */
	private String questId;
	
	/**
	 * 请求路径
	 */
	private String url;

	/**
	 * 身份标记
	 */
	private String identification;
	
	/**
	 * 状态
	 */
	private String status;
	
	/**
	 * 请求选项
	 */
	private RequestOption requestOption;
	
	/**
	 * 参数
	 */
	private Map<String, String> params;
	
	/**
	 * 请求时间
	 */
	private long requestTime;
	
	/**
	 * 执行时间
	 */
	private long excuteTime;
	
	/**
	 * 响应时间
	 */
	private long responseTime;
	
	/**
	 * 请求IP
	 */
	private String requestIP;
	
	/**
	 * 结果字符串
	 */
	private String result;

	public String getQuestId() {
		return questId;
	}

	public void setQuestId(String questId) {
		this.questId = questId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public RequestOption getRequestOption() {
		return requestOption;
	}

	public void setRequestOption(RequestOption requestOption) {
		this.requestOption = requestOption;
	}

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}

	public long getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(long requestTime) {
		this.requestTime = requestTime;
	}

	public long getExcuteTime() {
		return excuteTime;
	}

	public void setExcuteTime(long excuteTime) {
		this.excuteTime = excuteTime;
	}

	public long getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(long responseTime) {
		this.responseTime = responseTime;
	}

	public String getRequestIP() {
		return requestIP;
	}

	public void setRequestIP(String requestIP) {
		this.requestIP = requestIP;
	}
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}

}

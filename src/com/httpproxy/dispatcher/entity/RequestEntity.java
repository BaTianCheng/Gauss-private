package com.httpproxy.dispatcher.entity;

import java.util.Map;

/**
 * 请求业务实例
 * @author wicks
 */
public class RequestEntity {
	
	private String questId;
	
	private String url;
	
	private String status;
	
	private RequestOption requestOption;
	
	private Map<String, String> params;
	
	private long requestTime;
	
	private long enqueueTime;
	
	private String requestIP;

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

	public long getEnqueueTime() {
		return enqueueTime;
	}

	public void setEnqueueTime(long enqueueTime) {
		this.enqueueTime = enqueueTime;
	}

	public String getRequestIP() {
		return requestIP;
	}

	public void setRequestIP(String requestIP) {
		this.requestIP = requestIP;
	}

}

package com.esb.guass.server.entity;

import com.alibaba.fastjson.JSON;

public class ResponseResult {
	
	private String statusCode;
	
	private String message;
	
	private String questId;
	
	private Object data;

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getQuestId() {
		return questId;
	}

	public void setQuestId(String questId) {
		this.questId = questId;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}

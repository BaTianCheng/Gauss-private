package com.httpproxy.dispatcher.runnable;

import com.httpproxy.client.HttpOperator;
import com.httpproxy.common.util.LogUtils;
import com.httpproxy.dispatcher.entity.RequestEntity;
import com.httpproxy.dispatcher.service.RequestQueue;
import com.httpproxy.dispatcher.service.RequestService;

/**
 * 请求执行线程
 * @author wicks
 */
public class RequsetRunnable implements Runnable{

	@Override
	public void run() {
		RequestEntity requestEntity = RequestQueue.poll();
		requestEntity.setExcuteTime(System.currentTimeMillis());
		if(requestEntity != null){
			try {
				String result = HttpOperator.buildRequest(requestEntity);
				requestEntity.setResponseTime(System.currentTimeMillis());
				requestEntity.setResult(result);
				RequestService.update(requestEntity);
			} catch (Throwable thrown) {
				LogUtils.error("Http请求发送异常："+requestEntity.getQuestId(), thrown);
			}
		}
		
	}

}

package com.esb.guass.dispatcher.runnable;

import com.esb.guass.client.service.HttpOperatorService;
import com.esb.guass.common.util.LogUtils;
import com.esb.guass.dispatcher.entity.RequestEntity;
import com.esb.guass.dispatcher.service.RequestQueue;
import com.esb.guass.dispatcher.service.RequestService;

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
				String result = HttpOperatorService.buildRequest(requestEntity);
				requestEntity.setResponseTime(System.currentTimeMillis());
				requestEntity.setResult(result);
				RequestService.update(requestEntity);
			} catch (Throwable thrown) {
				LogUtils.error("Http请求发送异常："+requestEntity.getQuestId(), thrown);
			}
		}
		
	}

}

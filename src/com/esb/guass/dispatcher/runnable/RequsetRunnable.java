package com.esb.guass.dispatcher.runnable;

import com.esb.guass.client.entity.HttpResponse;
import com.esb.guass.client.service.HttpOperatorService;
import com.esb.guass.common.cache.ehcache.EhCacheService;
import com.esb.guass.common.constant.StatusConstant;
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
		//考虑到操作频繁，暂不入库，只入缓存
		RequestEntity requestEntity = RequestQueue.poll();
		requestEntity.setExcuteTime(System.currentTimeMillis());
		requestEntity.setStatus(StatusConstant.CODE_1202);
		EhCacheService.setResultCache(requestEntity);
		
		if(requestEntity != null){
			try {
				HttpResponse response = HttpOperatorService.buildRequest(requestEntity);
				if(response == null){
					throw new Exception();
				}
				requestEntity.setResponseTime(System.currentTimeMillis());
				requestEntity.setStatus(StatusConstant.CODE_1203);
				requestEntity.setResult( response.getStringResult());
				requestEntity.setResponseCharset( response.getCharset());
				requestEntity.setResponseHeaders(response.getResponseHeaders());
				RequestService.update(requestEntity);
			} catch (Throwable thrown) {
				requestEntity.setResponseTime(System.currentTimeMillis());
				requestEntity.setStatus(StatusConstant.CODE_1400);
				RequestService.update(requestEntity);
				LogUtils.error("Http请求发送异常："+requestEntity.getQuestId(), thrown);
			}
		}
		
	}

}

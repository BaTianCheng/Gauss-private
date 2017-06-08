package com.httpproxy.dispatcher.runnable;

import com.httpproxy.client.HttpOperator;
import com.httpproxy.dispatcher.entity.RequestEntity;
import com.httpproxy.dispatcher.service.RequestQueue;

/**
 * 请求执行线程
 * @author wicks
 */
public class RequsetRunnable implements Runnable{

	@Override
	public void run() {
		RequestEntity requestEntity = RequestQueue.poll();
		if(requestEntity != null){
			String result = HttpOperator.buildRequest(requestEntity);
		}
		
	}

}

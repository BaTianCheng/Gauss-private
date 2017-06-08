package com.httpproxy.test;

import com.google.common.util.concurrent.Monitor;
import com.httpproxy.dispatcher.entity.RequestEntity;
import com.httpproxy.dispatcher.runnable.MonitorRunnable;
import com.httpproxy.dispatcher.service.RequestQueue;
import com.httpproxy.dispatcher.service.ThreadPoolService;

public class ThreadPoolTest {
	
	public static void main(String[] args) {
		/*
		for(int i=0;i<10;i++){
			ThreadPoolService.execute(new Runnable() {
				@Override
				public void run() {
					try {
						System.out.println(ThreadPoolService.getActiveCount());
						Thread.sleep(2000);
						System.out.println("END");
						System.out.println(ThreadPoolService.getActiveCount());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
		*/
		
		for(int i=0;i<20;i++){
			RequestQueue.add(new RequestEntity());
		}
		
		Thread thread = new Thread(new MonitorRunnable());
		thread.start();
		
	}
}

package com.httpproxy.server;

import org.redkale.boot.ApiDocs;
import org.redkale.boot.Application;

/**
 * 服务主程序
 * @author wicks
 */
public class Server {

	public static void main(String[] args) {
		 try {
			 //主程序启动
			Application.main(args);
			final Application application = Application.create(true);
            application.init();
            application.start();
            //API文档自动生成
            new ApiDocs(application).run();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

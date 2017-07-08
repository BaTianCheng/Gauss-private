package com.esb.guass.server.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.redkale.net.http.HttpRequest;
import org.redkale.net.http.HttpResponse;
import org.redkale.net.http.WebServlet;

import com.esb.guass.dispatcher.service.RequestQueue;
import com.esb.guass.server.base.BaseSerlvet;

@WebServlet(value = {"/manger/*"}, comment = "ESB管理")
public class MangerServlert extends BaseSerlvet {
	
    /**
     * HTTP代理发送请求服务
     * @param req
     * @param resp
     * @throws IOException
     */
    @AuthIgnore
    @WebMapping(url = "/manger/status/get", comment = "管理服务状态获取")
    public void getStatus(HttpRequest req, HttpResponse resp) throws IOException {
    	Map<String, Integer> map = new HashMap<>();
    	map.put("queueSize", RequestQueue.getSize());
    	this.writeSuccessResult(resp, map);
    }

}

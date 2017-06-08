package com.httpproxy.server.servlet;

import java.io.IOException;

import org.redkale.net.http.HttpRequest;
import org.redkale.net.http.HttpResponse;
import org.redkale.net.http.WebServlet;

import com.httpproxy.server.base.BaseSerlvet;

/**
 * Htpp代理服务
 * @author wicks
 */
@WebServlet(value = {"/proxy/*"}, comment = "Htpp代理服务")
public class HttpProxyServlet extends BaseSerlvet {

    /**
     * HTTP代理发送请求服务
     * @param req
     * @param resp
     * @throws IOException
     */
    @AuthIgnore
    @WebMapping(url = "/proxy/request", comment = "HTTP代理发送请求服务")
    @WebParam(name = "bean", type = String.class, comment = "请求参数对象")
    public void login(HttpRequest req, HttpResponse resp) throws IOException {
    	//String bean = req.getJsonParameter(String.class, "bean"); 
        String result="hello word";
        resp.finishJson(result); 
    }
}

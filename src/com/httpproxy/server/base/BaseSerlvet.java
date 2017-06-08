package com.httpproxy.server.base;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Resource;

import org.redkale.convert.json.JsonConvert;
import org.redkale.convert.json.JsonFactory;
import org.redkale.net.http.HttpRequest;
import org.redkale.net.http.HttpResponse;
import org.redkale.net.http.HttpServlet;

/**
 * Serlvet基类
 * @author wicks
 */
public class BaseSerlvet extends org.redkale.net.http.HttpBaseServlet {

    protected final Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    protected final boolean fine = logger.isLoggable(Level.FINE);

    @Resource(name = "APP_TIME") 
    protected long serverCreateTime;

    @Resource 
    protected JsonConvert jsonConvert;

    @Resource 
    protected JsonFactory jsonFactory;

    //当前进程的根目录
    @Resource(name = "APP_HOME")
    protected File home;

    //当前Http Server的web页面的根目录
    @Resource(name = "SERVER_ROOT")
    protected File webroot;

    //前置拦截器
    @Override
    public void preExecute(final HttpRequest request, final HttpResponse response, HttpServlet next) throws IOException {
    	//记录所有请求
        if (fine) response.setRecycleListener((req, resp) -> {  
                long e = System.currentTimeMillis() - request.getCreatetime();
               logger.fine("请求耗时" + e + " 毫秒. 请求为: " + req);
            });
        next.execute(request, response);
    }

    //鉴权方法，目前不鉴权
    @Override
    public void authenticate(int moduleid, int actionid, HttpRequest request, HttpResponse response, HttpServlet next) throws IOException {
        next.execute(request, response);
    }
}

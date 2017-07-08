package com.esb.guass.server.servlet;

import java.io.IOException;

import org.redkale.net.http.HttpRequest;
import org.redkale.net.http.HttpResponse;
import org.redkale.net.http.WebServlet;

import com.esb.guass.common.constant.StatusConstant;
import com.esb.guass.dispatcher.entity.ServiceEntity;
import com.esb.guass.dispatcher.service.ServiceMangerService;
import com.esb.guass.server.base.BaseSerlvet;
import com.google.common.base.Strings;

@WebServlet(value = {"/service/*"}, comment = "ESB服务管理")
public class ServiceServlet extends BaseSerlvet {

	/**
     * ESB服务请求
     * @param req
     * @param resp
     * @throws IOException
     */
    @AuthIgnore
    @WebMapping(url = "/services/get", comment = "获取ESB服务项")
    public void getService(HttpRequest req, HttpResponse resp) throws IOException {
    	if(Strings.isNullOrEmpty(req.getParameter("serviceName")) || Strings.isNullOrEmpty(req.getParameter("identification"))){
    		this.writeErrorResult(resp, StatusConstant.CODE_400, StatusConstant.CODE_400_MSG, null);
    	} else {
    		ServiceEntity serviceEntity = new ServiceEntity();
    		serviceEntity.setServiceName(req.getParameter("serviceName"));
    		String questId = ServiceMangerService.sendService(serviceEntity, req.getParameter("identification"));
    		this.writeSuccessResult(resp, null, StatusConstant.CODE_200_MSG, questId);
    	}
    }
    
}

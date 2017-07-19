package com.esb.jinying.sap.servlet;

import java.io.IOException;
import java.util.UUID;

import org.redkale.net.http.HttpRequest;
import org.redkale.net.http.HttpResponse;
import org.redkale.net.http.WebServlet;

import com.esb.guass.common.constant.ConfigConstant;
import com.esb.guass.common.constant.StatusConstant;
import com.esb.guass.dispatcher.entity.RequestEntity;
import com.esb.guass.dispatcher.service.RequestQueue;
import com.esb.guass.dispatcher.service.RequestService;
import com.esb.guass.server.base.BaseSerlvet;

/**
 * SAP下传
 * @author wicks
 */
@WebServlet(value = {"/modules/sap/download/*"}, comment = "SAP下传")
public class DownLoadServlet extends BaseSerlvet {
	
	/**
     * BW品牌业绩考核下传
     * @param req
     * @param resp
     * @throws IOException
     */
    @AuthIgnore
    @WebMapping(url = "/modules/sap/download/NetBrandKH", comment = "BW品牌业绩考核下传")
    public void request(HttpRequest req, HttpResponse resp) throws IOException {
		RequestEntity requestEntity = new RequestEntity();
		requestEntity.setQuestId(UUID.randomUUID().toString());
		requestEntity.setRequestType(ConfigConstant.API);
		requestEntity.setUrl("com.esb.jinying.sap.service.download.NetBrandKHHandler");
		requestEntity.setRequestIP(req.getRemoteAddr());
		requestEntity.setRequestTime(req.getCreatetime());
		requestEntity.setStatus(StatusConstant.CODE_1201);
		RequestService.insert(requestEntity);
		RequestQueue.add(requestEntity);
		this.writeSuccessResult(resp, null, StatusConstant.CODE_200_MSG, requestEntity.getQuestId());
    }

}

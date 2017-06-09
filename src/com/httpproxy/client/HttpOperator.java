package com.httpproxy.client;

import java.util.Map;

import com.httpproxy.client.common.HttpRequest;
import com.httpproxy.client.common.HttpResponse;
import com.httpproxy.client.common.HttpResultType;
import com.httpproxy.common.util.StringUtils;
import com.httpproxy.dispatcher.entity.RequestEntity;

public class HttpOperator {
	
	/**
	 * 构建HTTP请求
	 * @param requestEntity
	 * @return
	 */
	public static String buildRequest(RequestEntity requestEntity) throws Exception{
		return buildRequest(requestEntity.getParams(),requestEntity.getRequestOption().getHead(),requestEntity.getUrl(),
				requestEntity.getRequestOption().getMethod(),requestEntity.getRequestOption().getCharset(),requestEntity.getRequestOption().isBody());
	}
	
	/**
	 * 构建HTTP请求
	 * @param sPara
	 * @param url
	 * @return
	 * @throws Exception
	 */
	public static String buildRequest(Map<String, String> sPara, Map<String, String> headers, String url, String method, String charset, boolean isBody) throws Exception {

        HttpProtocolHandler httpProtocolHandler = HttpProtocolHandler.getInstance();

        HttpRequest request = new HttpRequest(HttpResultType.BYTES);
        //设置编码集
        request.setCharset(charset);
        request.setParameters(StringUtils.generatNameValuePair(sPara));
        request.setMethod(method);
        request.setUrl(url);

        HttpResponse response = httpProtocolHandler.execute(request, "", "", headers, isBody);
        if (response == null) {
            return null;
        }

        String strResult = response.getStringResult();

        return strResult;
    }
	
}

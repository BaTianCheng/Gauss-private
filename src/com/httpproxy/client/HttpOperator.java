package com.httpproxy.client;

import java.util.Map;
import java.util.Random;

import com.httpproxy.client.common.HttpRequest;
import com.httpproxy.client.common.HttpResponse;
import com.httpproxy.client.common.HttpResultType;
import com.httpproxy.common.util.StringUtils;
import com.httpproxy.dispatcher.entity.RequestEntity;

public class HttpOperator {
	
	/**
	 * 构建HTTO请求
	 * @param requestEntity
	 * @return
	 */
	public static String buildRequest(RequestEntity requestEntity){
		Random rand = new Random();
		try {
			Thread.sleep(rand.nextInt(10000));
			System.out.println("END");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
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

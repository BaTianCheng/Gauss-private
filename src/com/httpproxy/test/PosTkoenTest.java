package com.httpproxy.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.alibaba.fastjson.JSON;
import com.httpproxy.client.HttpOperator;
import com.httpproxy.common.util.DateUtil;
import com.httpproxy.common.util.EncryptionUtil;


public class PosTkoenTest {

	public static void main(String[] args) {
		String POSTPAY_URL_ACCESSTOKEN= "https://api-mop.chinaums.com/v1/token/access";
		String APPID = "469381435b10e526015b7fcdaf1804b1";
		String APPKEY = "63528b2880644e4f99bf999f15d69522";
		
//		String POSTPAY_URL_ACCESSTOKEN= "http://116.228.21.162:29015/v1/token/access";
//		String APPID = "f0ec96ad2c3848b5b810e7aadf369e2f";
//		String APPKEY = "775481e2556e4564985f5439a5e6a277";
		try{
			Map<String, String> sPara = new HashMap<String, String>();
			Random rand = new Random();
			String accessToken;
			sPara.put("appId", APPID);
			sPara.put("timestamp", DateUtil.getCurrentDateTime(DateUtil.TYPE_YYYYMMDDHH24MMSS));
			sPara.put("nonce", String.valueOf(rand.nextInt(10000)+100000));
			sPara.put("signature", EncryptionUtil.getSha1(sPara.get("appId"), sPara.get("timestamp"), sPara.get("nonce"), APPKEY));
			System.out.println(sPara);
			accessToken = HttpOperator.buildRequest(sPara, null, POSTPAY_URL_ACCESSTOKEN, "POST", "UTF8", true);
			System.out.println(accessToken);
			System.out.println(JSON.parseObject(accessToken).get("accessToken"));
		}
		catch(Throwable t){
			System.out.println(t);
		}
		
	}

}

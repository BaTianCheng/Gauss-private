package com.esb.jinying.sap.service.download;

import java.util.HashMap;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		NetBrandKHHandler nk = new NetBrandKHHandler();
		Map<String, String> mapSimple = new HashMap<>();
		mapSimple.put("net_brandkh_ym","");
		nk.HandlerRequest("1",mapSimple);
		
	}

}

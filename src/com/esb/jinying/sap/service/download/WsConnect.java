package com.esb.jinying.sap.service.download;

//import goodee.book.sapsoap.brand.*;
//import goodee.book.sapsoap.product.*;

import com.esb.guass.common.util.LogUtils;
import com.esb.jinying.sap.dealup.net.*;
import com.esb.jinying.sap.dealup.pos.*;
import com.esb.jinying.sap.dealup.rf.*;
import com.esb.jinying.sap.dealup.sp.SIO_SPBindingStub;

/**
* Title:        WsConnect
* CopyRright:	Copyright (c) 2011
* Company:      GE.Corp
* Project:		SapWebService
* Description:  连接SAP webservice
* JDK version:  <JDK1.5>
* Author：      Pian Zhaobin
* Create Date： 2012-01-11
* Version:      1.0
*/
public class WsConnect {
	
	private SIO_POS010BindingStub bindingPOS010 = null;
	private SIO_POS_ECC_ASYBindingStub bindingPOSECC = null;
	private SIO_POSBindingStub bindingPOS = null;
	private SIO_NETBindingStub bindingNetProductUpload = null;
	private static String strUserName = "int_pos";
	private static String strPassword = "Basisgxp0";
	private SIO_RFBindingStub bindingRF = null;
	private SIO_SPBindingStub bindingSupplyBrand = null;

	public  WsConnect(String strWebService)  {
		try{
			//小票上传
			if("SIO_POS_010".equals(strWebService))
			{
				XI_55623E1B36Fc3B60B9E3Ed713E4E374E_Service  service = new XI_55623E1B36Fc3B60B9E3Ed713E4E374E_ServiceLocator();
				bindingPOS010 = (SIO_POS010BindingStub)service.getHTTP_Port();
				bindingPOS010.setUsername(strUserName);
				bindingPOS010.setPassword(strPassword);
			}
			//小票外其它接口上传
			else if("SIO_POS_ECC".equals(strWebService))
			{
				XI_1D1521Fcb07B30Ea995B991270Dc43B2_Service  service = new XI_1D1521Fcb07B30Ea995B991270Dc43B2_ServiceLocator();
				bindingPOSECC = (SIO_POS_ECC_ASYBindingStub)service.getHTTP_Port();
				bindingPOSECC.setUsername(strUserName);
				bindingPOSECC.setPassword(strPassword);
			}
			//BW下载数据
			else if("SIO_POS".equals(strWebService))
			{
				XI_635B315907723538Ba61Ee4Cb6009B2D_Service  service = new XI_635B315907723538Ba61Ee4Cb6009B2D_ServiceLocator();
				bindingPOS = (SIO_POSBindingStub)service.getHTTP_Port();
				bindingPOS.setUsername(strUserName);
				bindingPOS.setPassword(strPassword);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			LogUtils.error("连接SAP webservice出错:", e);
		}
	}
	
	
	public SIO_POS010BindingStub getBindingPOS010() {
		return bindingPOS010;
	}

	public void setBindingPOS010(SIO_POS010BindingStub bindingPOS010) {
		this.bindingPOS010 = bindingPOS010;
	}

	public SIO_POS_ECC_ASYBindingStub getBindingPOSECC() {
		return bindingPOSECC;
	}

	public void setBindingPOSECC(SIO_POS_ECC_ASYBindingStub bindingPOSECC) {
		this.bindingPOSECC = bindingPOSECC;
	}

	public SIO_POSBindingStub getBindingPOS() {
		return bindingPOS;
	}

	public void setBindingPOS(SIO_POSBindingStub bindingPOS) {
		this.bindingPOS = bindingPOS;
	}

	public SIO_NETBindingStub getBindingNetProductUpload() {
		return bindingNetProductUpload;
	}


	public void setBindingNetProductUpload(
			SIO_NETBindingStub bindingNetProductUpload) {
		this.bindingNetProductUpload = bindingNetProductUpload;
	}
	
	public SIO_RFBindingStub getBindingRF() {
		return bindingRF;
	}


	public void setBindingRF(SIO_RFBindingStub bindingRF) {
		this.bindingRF = bindingRF;
	}


	public SIO_SPBindingStub getBindingSupplyBrand() {
		return bindingSupplyBrand;
	}


	public void setBindingSupplyBrand(SIO_SPBindingStub bindingSupplyBrand) {
		this.bindingSupplyBrand = bindingSupplyBrand;
	}
}

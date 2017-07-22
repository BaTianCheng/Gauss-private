package com.esb.jinying.sap.service.download;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.redkale.source.DataSource;

import com.esb.guass.common.constant.StatusConstant;
import com.esb.guass.common.datasource.DataSourceManger;
import com.esb.guass.common.util.LogUtils;
import com.esb.guass.common.util.StringUtils;
import com.esb.guass.dispatcher.entity.ResultEntity;
import com.esb.guass.dispatcher.service.TrackService;
import com.esb.jinying.sap.dealup.pos.SIO_POSBindingStub;

import com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW017;
import com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZFM_INT_BW017Response;
import com.esb.jinying.sap.functions.rfc.sap.document.sap_com.ZTZSKH;
import com.google.common.base.Strings;

/**
 * BW品牌业绩考核下传
 * @author wicks
 */
public class NetBrandKHHandler {
	
	//数据源名称、ws服务名称
	private final String dataSourceName = "www_jinying_com";
	private final String webServiceName = "SIO_POS";
	
	//下传日期，是否已存在标记，异常标记，任务编号
	public String strShiftMonthList;
	public boolean isHas;
	public Throwable throwable = null;
	public String questId;

	public ResultEntity HandlerRequest(String questId, Map<String, String> mapSimple){
		this.questId = questId;
		String strSQL = "";
		ZTZSKH[] tab1 = null;
		ZFM_INT_BW017 parameters = null;
		ZFM_INT_BW017Response response = null;
		String strReturn = "";
		int dAmount = 0;
		
		try {
			//获取数据源和ws服务
			DataSource ds =DataSourceManger.getDataSource(dataSourceName);
			WsConnect wsConnect = new WsConnect(webServiceName);
	        SIO_POSBindingStub binding = wsConnect.getBindingPOS();
	        
	        //初始化参数
			if(mapSimple!= null && mapSimple.containsKey("net_brandkh_ym")){
				strShiftMonthList = mapSimple.get("net_brandkh_ym").toString();
			}
			
			//取得上个月月份
			if (Strings.isNullOrEmpty(strShiftMonthList)) {
				strSQL = "select date_format(date_sub(date_sub(date_format(now(),'%y-%m-%d'),interval extract(day from now())-1 day),interval 1 month),'%Y%m') time";
				ds.directQuery(strSQL, rs -> setStrShiftMonthList(rs));
			}
			if(throwable != null){
				throw throwable;
			}
			LogUtils.info(questId+">BW-品牌业绩考核下传开始，参数："+mapSimple);
			
			for (String strShiftMonth : strShiftMonthList.split(",")) {
				strShiftMonth = strShiftMonth.trim();
				TrackService.record(questId, "月份:" + strShiftMonth + " BW-品牌业绩考核下传。。。");

				tab1 = new ZTZSKH[] {};
				parameters = new ZFM_INT_BW017();
				parameters.setZMONTH(strShiftMonth);
				parameters.setZ_OUT(tab1);

				response = binding.SIO_POS034(parameters);
				tab1 = response.getZ_OUT();
				TrackService.record(questId, "Web Service数据获取完成");
				TrackService.record(questId, "正在进行数据下传，条数："+tab1.length);
				
				//进行数据下传更新
				for (int i = 0; i < tab1.length; i++) {
					String strYM = tab1[i].getZMONTH();
					String strGSDM = tab1[i].getZGSDM();
					strGSDM = "01" + strGSDM.substring(2);
					String strCategory = tab1[i].getZCML();
					String strBrandNo = tab1[i].getZPPBM();
					BigDecimal bZPXMJ = tab1[i].getZPXMJ();
					BigDecimal bZSXJE = tab1[i].getZSXJE();
					BigDecimal bZZGSP = tab1[i].getZGSP();
					BigDecimal bZCWMLE = tab1[i].getZCWMLE();
					BigDecimal bZSQSX = tab1[i].getZSQSX();
					BigDecimal bZSXTB = tab1[i].getZSXTB();
					BigDecimal bZSQGSP = tab1[i].getZSQGSP();
					BigDecimal bZGSPTB = tab1[i].getZGSPTB();
					BigDecimal bZSQCWMLE = tab1[i].getZSQCWMLE();
					BigDecimal bZCWMLTB = tab1[i].getZCWMLTB();
					
					strSQL = "select 1 from brand_cooperate_season_kh where ZMONTH = '"+strYM+"' and ZGSDM = '"+
							strGSDM+"' and ZCML = '"+strCategory+"' and ZPPBM = '"+strBrandNo+"'";
					ds.directQuery(strSQL, (rs) -> {
						try {
							if (rs.next()) {
								isHas = true;
							} else {
								isHas =false;
							}
						} catch (Exception e) {
							throwable = e;
						}
					});
					if(throwable != null){
						throw throwable;
					}
					
					//存在数据进行更新，否则进行插入
					if(isHas){
						String strSqlUpdate = "update brand_cooperate_season_kh set ZPXMJ = ?, ZSXJE = ?, ZGSP = ?, ZCWMLE = ?, ZSQSX = ?, ZSXTB = ?, ZSQGSP = ?, ZGSPTB = ?, ZSQCWMLE = ?, ZCWMLTB = ? "         
								+ "where ZMONTH = ? and ZGSDM = ? and ZCML = ? and ZPPBM = ? ";
						strSqlUpdate=StringUtils.setSqlParam(strSqlUpdate, bZPXMJ);
						strSqlUpdate=StringUtils.setSqlParam(strSqlUpdate, bZSXJE);
						strSqlUpdate=StringUtils.setSqlParam(strSqlUpdate, bZZGSP);
						strSqlUpdate=StringUtils.setSqlParam(strSqlUpdate, bZCWMLE);
						strSqlUpdate=StringUtils.setSqlParam(strSqlUpdate, bZSQSX);
						strSqlUpdate=StringUtils.setSqlParam(strSqlUpdate, bZSXTB);
						strSqlUpdate=StringUtils.setSqlParam(strSqlUpdate, bZSQGSP);
						strSqlUpdate=StringUtils.setSqlParam(strSqlUpdate, bZGSPTB);
						strSqlUpdate=StringUtils.setSqlParam(strSqlUpdate, bZSQCWMLE);
						strSqlUpdate=StringUtils.setSqlParam(strSqlUpdate, bZCWMLTB);
						strSqlUpdate=StringUtils.setSqlParam(strSqlUpdate, strYM);
						strSqlUpdate=StringUtils.setSqlParam(strSqlUpdate, strGSDM);
						strSqlUpdate=StringUtils.setSqlParam(strSqlUpdate, strCategory);
						strSqlUpdate=StringUtils.setSqlParam(strSqlUpdate, strBrandNo);
						ds.directExecute(strSqlUpdate);
					} else {
						String strSqlInsert = "insert into brand_cooperate_season_kh(ZMONTH, ZGSDM, ZCML, ZPPBM, ZPXMJ, ZSXJE, ZGSP, ZCWMLE, ZSQSX, ZSXTB, ZSQGSP, ZGSPTB, ZSQCWMLE, ZCWMLTB) "
						         + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
						strSqlInsert=StringUtils.setSqlParam(strSqlInsert, strYM);
						strSqlInsert=StringUtils.setSqlParam(strSqlInsert, strGSDM);
						strSqlInsert=StringUtils.setSqlParam(strSqlInsert, strCategory);
						strSqlInsert=StringUtils.setSqlParam(strSqlInsert, strBrandNo);
						strSqlInsert=StringUtils.setSqlParam(strSqlInsert, bZPXMJ);
						strSqlInsert=StringUtils.setSqlParam(strSqlInsert, bZSXJE);
						strSqlInsert=StringUtils.setSqlParam(strSqlInsert, bZZGSP);
						strSqlInsert=StringUtils.setSqlParam(strSqlInsert, bZCWMLE);
						strSqlInsert=StringUtils.setSqlParam(strSqlInsert, bZSQSX);
						strSqlInsert=StringUtils.setSqlParam(strSqlInsert, bZSXTB);
						strSqlInsert=StringUtils.setSqlParam(strSqlInsert, bZSQGSP);
						strSqlInsert=StringUtils.setSqlParam(strSqlInsert, bZGSPTB);
						strSqlInsert=StringUtils.setSqlParam(strSqlInsert, bZSQCWMLE);
						strSqlInsert=StringUtils.setSqlParam(strSqlInsert, bZCWMLTB);
						ds.directExecute(strSqlInsert);
					}
					dAmount += 1;
				}
			}

			strReturn = "0000" + "BW-品牌业绩考核下传成功-总条数：" + dAmount;
			LogUtils.info(questId+">"+strReturn);
			TrackService.record(questId, strReturn);
			ResultEntity result = new ResultEntity();
			result.setStatusCode(StatusConstant.CODE_200);
			result.setMessage(strReturn);
			return result;
		} catch (Throwable e) {
			strReturn = "8888BW-品牌业绩考核下传处理异常-已传条数： "+ dAmount + "        " + e.toString();
			LogUtils.error(questId+">BW-品牌业绩考核下传异常-已传条数： "+ dAmount, e);
			TrackService.record(questId, strReturn);
			ResultEntity result = new ResultEntity();
			result.setStatusCode(StatusConstant.CODE_500);
			result.setMessage(strReturn);
			return result;
		} 
	}
	
	/**
	 * 设置时间范围
	 * @param rs
	 */
	public void setStrShiftMonthList(ResultSet rs){
		try {
			if (rs.next()) {
				strShiftMonthList = rs.getString("time");
				if (strShiftMonthList != null && !strShiftMonthList.equals("")) {
					String strYear = strShiftMonthList.substring(0, 3);
					String strMonth = strShiftMonthList.substring(4);
					if (strMonth.equals("03")) {
						strShiftMonthList += "," + strYear + "J1";
					} else if (strMonth.equals("06")) {
						strShiftMonthList += "," + strYear + "J2";
					} else if (strMonth.equals("09")) {
						strShiftMonthList += "," + strYear + "J3";
					} else if (strMonth.equals("12")) {
						strShiftMonthList += "," + strYear + "J4";
					}
				}
			}
		} catch (SQLException e) {
			TrackService.record(questId, "设置时间范围失败");
			throwable = e;
		}
	}

}

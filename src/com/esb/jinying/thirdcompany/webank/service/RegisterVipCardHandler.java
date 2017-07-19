package com.esb.jinying.thirdcompany.webank.service;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.redkale.source.DataSource;

import com.alibaba.fastjson.JSON;
import com.esb.guass.common.constant.StatusConstant;
import com.esb.guass.common.datasource.DataSourceManger;
import com.esb.guass.common.util.LogUtils;
import com.esb.guass.common.util.StringUtils;
import com.esb.guass.dispatcher.entity.ResultEntity;
import com.esb.jinying.common.PubUtils;
import com.google.common.base.Strings;

/**
 * 注册VIP卡（有的话返回，无的话新增）
 * @author wicks
 */
public class RegisterVipCardHandler {
	
	//数据源名称、ws服务名称
	private final String dataSourceName = "RGCMS";
	
	//卡号，流水号
	String cardNo = "";
	String strGlideNo = "";
	String errMsg = "服务异常";
	public Throwable throwable = null;

	public ResultEntity HandlerRequest(String questId, Map<String, String> params){
		try {
			//获取数据源
			DataSource ds =DataSourceManger.getDataSource(dataSourceName);
			String strSQL = "";
			
			//是否新用户
			String isNew = "1";
			
			//签名校验
			//Todo
			
			// 请求来源    01:微信     02:网站   	03:金鹰购  04:shopping 05:第三方平台  06:汽车公司   10:掌上金鹰
			String strFrom = StringUtils.getJsonMap(params.get("from"), "0");	
			
			//卡类型 0017：积点卡
			String strTypeFlag = "0017";
			
			// 手机号
			String strMobilePhone = StringUtils.getJsonMap(params.get("mobile"), "");	
			
			// 姓名
			String strChineseName = StringUtils.getJsonMap(params.get("chineseName"), "未知");	
			
			// 身份证号
			String strIdCard = StringUtils.getJsonMap(params.get("idNumber"), "");	

			// 地址
			String strAddres = StringUtils.getJsonMap(params.get("address"), "");

			// E-mail
			String strEmail = StringUtils.getJsonMap(params.get("email"), "");
						
			// Company_no
			String strCompanyNo = StringUtils.getJsonMap(params.get("companyNo"), "0101");
			
			
			if (Strings.isNullOrEmpty(strMobilePhone)) {
				errMsg = "手机号不能为空";
				throw new Exception("手机号不能为空");
			} else {
				// 查询手机信息
				strSQL = "select a.card_no" + " from crd_info a,crd_register b " + " where a.vip_no = b.vip_no "
						+ " and lengthb(b.id_card) >= 6 " + " and b.mobile_phone = '" + strMobilePhone + "'"
						+ " and a.usable_flag = '1' " + " and a.loss_flag = '0' " + " and a.logout_flag = '0' "
						+ " and a.curr_valid_date >= to_char(sysdate,'yyyymmdd')";
				ds.directQuery(strSQL, (rs) -> {getCardNo(rs);});
			}
			if(throwable != null){
				throw throwable;
			}
			
			if(Strings.isNullOrEmpty(cardNo)){
				// 身份证号为空时，自动生成一个身份证号
				if (Strings.isNullOrEmpty(strIdCard)) {
					// 记录扣减流水
					strSQL = "select FUNC_PUB_GENERATE_GLIDE_NO('CRD_REGISTER_IDCARD') FROM dual";
					ds.directQuery(strSQL, (rs) -> {getGlideNo(rs);});
					if(throwable != null){
						throw throwable;
					}
					if ("0".equals(strFrom)) {
						strIdCard = "GEWEIXIN" + strGlideNo;
					} else if ("01".equals(strFrom)) {
						strIdCard = "GEWXPROJ" + strGlideNo;
					} else if ("02".equals(strFrom)) {
						strIdCard = "GEWEBNET" + strGlideNo;
					} else if ("03".equals(strFrom)) {
						strIdCard = "GEJINYGO" + strGlideNo;
					} else if ("04".equals(strFrom)) {
						strIdCard = "SHOPPING" + strGlideNo;
					} else if("05".equals(strFrom)) {
						strIdCard = "GEWIFIUS" + strGlideNo;
					}
				}
				
				//身份证位数校验
				/*
				if (strIdCard.getBytes().length != 18) {
					errMsg = "身份证号必须是18位";
					throw new Exception("身份证号必须是18位");
				}
				*/
				
				//进行VIP卡注册
				strSQL = "{call PROC_EVIP_SEND_TYPE(?,?,?,?,?,?,?,?,?)}";
				strSQL=StringUtils.setSqlParam(strSQL, strTypeFlag);
				strSQL=StringUtils.setSqlParam(strSQL, strMobilePhone);
				strSQL=StringUtils.setSqlParam(strSQL, strIdCard);
				strSQL=StringUtils.setSqlParam(strSQL, strChineseName);
				strSQL=StringUtils.setSqlParam(strSQL, strAddres);
				strSQL=StringUtils.setSqlParam(strSQL, strEmail);
				strSQL=StringUtils.setSqlParam(strSQL, strCompanyNo);
				strSQL=StringUtils.setSqlParam(strSQL, strFrom);
				String iRtn = ds.directCall(strSQL, 1, java.sql.Types.VARCHAR);
				if(iRtn.equals("0")){
					errMsg = "新卡注册失败";
					throw new Exception("新卡注册失败");
				}
				
				//获取注册后的卡号
				strSQL = "select card_no  from  crd_register "
						+ " where mobile_phone = '" + strMobilePhone + "'";
				ds.directQuery(strSQL, (rs) -> {getCardNo(rs);});
			
				if(throwable != null){
					throw throwable;
				}
			} else {
				isNew = "0";
			}
			
			//组装结果
			Map<String, String> result = new HashMap<>();
			result.put("resultCode", "0");
			result.put("resultMsg", "返回成功");
			result.put("vipNo", cardNo);
			result.put("isNew", isNew);
			result.put("isSendETKT", "0");
			ResultEntity resultEntity = new ResultEntity();
			resultEntity.setStatusCode(StatusConstant.CODE_200);
			resultEntity.setMessage(JSON.toJSONString(result));
			return resultEntity;
		} catch (Throwable e) {
			LogUtils.error(questId+">会员卡注册失败", e);
			Map<String, String> result = new HashMap<>();
			result.put("resultCode", "1");
			result.put("resultMsg", errMsg);
			ResultEntity resultEntity = new ResultEntity();
			resultEntity.setStatusCode(StatusConstant.CODE_500);
			resultEntity.setMessage(JSON.toJSONString(result));
			return resultEntity;
		}
	}
	
	/**
	 * 获取卡号
	 * @param rs
	 */
	public void getCardNo(ResultSet rs){
		try {
			if(rs.next()){
				cardNo = rs.getString(1);
			}
		} catch (Exception e) {
			throwable = e;
		}
	}
	
	/**
	 * 自动生成流水号
	 * @param rs
	 */
	public void getGlideNo(ResultSet rs){
		try {
			if(rs.next()){
				strGlideNo = rs.getString(1);
				//strGlideNo = PubUtils.increaseGlideNo(strGlideNo);
			}
		} catch (Exception e) {
			throwable = e;
		}
	}
	/*
	 * 					strSQL = "select  current_billno  from  s_billno_current_pub t "
							+ " where t.bill_type = 'CRD_REGISTER_IDCARD' and t.params='-' for update";
					Connection conn = ds.directQueryConn(strSQL, (rs) -> {getGlideNo(rs);});
					if(throwable != null){
						throw throwable;
					}
					strSQL = "update s_billno_current_pub t "
							+ "set t.current_billno = ? where t.bill_type ='CRD_REGISTER_IDCARD' and t.params ='-'";
					strSQL= StringUtils.setSqlParam(strSQL, strGlideNo);
					ds.directExecuteConn(conn, strSQL);
	 */
}

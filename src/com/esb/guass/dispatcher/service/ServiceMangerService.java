package com.esb.guass.dispatcher.service;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bson.Document;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.esb.guass.common.constant.HttpConstant;
import com.esb.guass.common.constant.StatusConstant;
import com.esb.guass.common.dao.mongo.MongoDAO;
import com.esb.guass.dispatcher.entity.RequestEntity;
import com.esb.guass.dispatcher.entity.RequestOption;
import com.esb.guass.dispatcher.entity.ServiceEntity;

/**
 * 服务管理服务类
 * @author wicks
 */
public class ServiceMangerService {

	private static final String dbName = "db_esb";
	
	private static final String collectionName = "tb_service";
	
	/**
	 * 发送服务
	 * @param serviceEntity
	 * @return
	 */
	public static String sendService(ServiceEntity serviceEntity, String identification){
		if(serviceEntity.getServiceName().equals("test")){
			RequestEntity requestEntity = new RequestEntity();
			requestEntity.setQuestId(UUID.randomUUID().toString());
    		requestEntity.setUrl("http://localhost:16060/esb/manger/status/get");
    		requestEntity.setIdentification(identification);
    		requestEntity.setStatus(StatusConstant.CODE_1201_MSG);
    		requestEntity.setParams(new HashMap<>());
    		RequestOption option = new RequestOption();
    		option.setCharset(HttpConstant.DEFAULT_CHARSET);
    		option.setMethod(HttpConstant.DEFAULT_METHOD);
    		option.setBody(false);
    		option.setHead(new HashMap<>());
    		requestEntity.setRequestOption(option);
    		RequestQueue.add(requestEntity);
    		RequestService.insert(requestEntity);
    		return requestEntity.getQuestId();
		}
		
		
		return "";
	}
	
	/**
	 * 插入数据
	 * @param entity
	 */
	public static void insert(ServiceEntity entity){
		Document doc = new Document(JSONObject.parseObject(entity.toString())) ;
		MongoDAO.getInstance().insert(dbName, collectionName, doc);
	}
	
	/**
	 * 更新数据
	 * @param entity
	 */
	public static void update(ServiceEntity entity){
		Document doc = new Document(JSONObject.parseObject(entity.toString())) ;
		Document filter = new Document();  
    	filter.append("serviceName", entity.getServiceName());  
		MongoDAO.getInstance().update(dbName, collectionName, filter, doc);
	}
	
	/**
	 * 查询
	 * @param serviceName
	 */
	public static ServiceEntity find(String serviceName){
		Document filter = new Document();  
    	filter.append("serviceName", serviceName);  
    	List<Document> docs = MongoDAO.getInstance().findBy(dbName, collectionName, filter);
    	if(docs.size() > 0){
    		return JSONObject.toJavaObject(JSONObject.parseObject(JSON.toJSONString(docs.get(0))), ServiceEntity.class);
    	}
    	return null;
	}
	
	/**
	 * 查询全部
	 */
	public static List<ServiceEntity> findAll(int pageNum, int pageSize){
		List<Document> docs = MongoDAO.getInstance().findAll(dbName, collectionName, pageNum, pageSize);
		return JSONArray.parseArray(JSON.toJSONString(docs), ServiceEntity.class);
	}
	
	/**
	 * 查询全部
	 */
	public static List<ServiceEntity> findAll(){
		List<Document> docs = MongoDAO.getInstance().findAll(dbName, collectionName);
		return JSONArray.parseArray(JSON.toJSONString(docs), ServiceEntity.class);
	}
}

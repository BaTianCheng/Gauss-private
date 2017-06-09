package com.esb.guass.dispatcher.service;

import java.util.List;

import org.bson.Document;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.esb.guass.dao.mongo.MongoDAO;
import com.esb.guass.dispatcher.entity.RequestEntity;

/**
 * 请求服务
 * @author wicks
 */
public class RequestService {

	private static final String dbName = "db_ebs";
	
	private static final String collectionName = "tb_request";
	
	/**
	 * 插入数据
	 * @param entity
	 */
	public static void insert(RequestEntity entity){
		Document doc = new Document(JSONObject.parseObject(entity.toString())) ;
		MongoDAO.getInstance().insert(dbName, collectionName, doc);
	}
	
	/**
	 * 更新数据
	 * @param entity
	 */
	public static void update(RequestEntity entity){
		Document doc = new Document(JSONObject.parseObject(entity.toString())) ;
		Document filter = new Document();  
    	filter.append("questId", entity.getQuestId());  
		MongoDAO.getInstance().update(dbName, collectionName, filter, doc);
	}
	
	/**
	 * 查询
	 * @param questId
	 */
	public static RequestEntity find(String questId){
		Document filter = new Document();  
    	filter.append("questId", questId);  
    	List<Document> docs = MongoDAO.getInstance().findBy(dbName, collectionName, filter);
    	if(docs.size() > 0){
    		return JSONObject.toJavaObject(JSONObject.parseObject(JSON.toJSONString(docs.get(0))), RequestEntity.class);
    	}
    	return null;
	}
	
	/**
	 * 查询全部
	 */
	public static List<RequestEntity> find( int pageNum, int pageSize){
		List<Document> docs = MongoDAO.getInstance().findAll(dbName, collectionName, pageNum, pageSize);
		return JSONArray.parseArray(JSON.toJSONString(docs), RequestEntity.class);
	}
	
	/**
	 * 查询全部
	 */
	public static List<RequestEntity> findAll(){
		List<Document> docs = MongoDAO.getInstance().findAll(dbName, collectionName);
		return JSONArray.parseArray(JSON.toJSONString(docs), RequestEntity.class);
	}
	
}

package com.esb.guass.dispatcher.service;

import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.esb.guass.common.cache.ehcache.EhCacheService;
import com.esb.guass.common.constant.StatusConstant;
import com.esb.guass.common.dao.mongo.MongoDAO;
import com.esb.guass.dispatcher.entity.RequestEntity;
import com.mongodb.BasicDBObject;

/**
 * 请求服务
 * @author wicks
 */
public class RequestService {

	private static final String dbName = "db_esb";
	
	private static final String collectionName = "tb_request";
	
	/**
	 * 插入数据
	 * @param entity
	 */
	public static void insert(RequestEntity entity){
		Document doc = new Document(JSONObject.parseObject(entity.toString())) ;
		MongoDAO.getInstance().insert(dbName, collectionName, doc);
		TrackService.record(entity.getQuestId(), StatusConstant.CODE_1201_MSG);
		
		//更新缓存
		EhCacheService.setResultCache(entity);
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
		
		//更新缓存
		EhCacheService.setResultCache(entity);
	}
	
	/**
	 * 查询
	 * @param questId
	 */
	public static RequestEntity find(String questId){
		//判断是否读取缓存
		if(EhCacheService.getResultCache(questId) != null){
			return EhCacheService.getResultCache(questId);
		}
		
		//无缓存时从数据库中查找
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
	public static List<RequestEntity> findAll(int pageNum, int pageSize){
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
	
	/**
	 * 按照时间进行查询
	 * @param beginTime
	 * @param endTime
	 * @return
	 */
	public static  List<RequestEntity> findByTime(long beginTime, long endTime, int pageNum, int pageSize){
		Bson filterA = new BasicDBObject("requestTime", new BasicDBObject("$gte", beginTime));
		Bson filterB = new BasicDBObject("requestTime", new BasicDBObject("$lte", endTime));
		Bson filter = new BasicDBObject("$and", Arrays.asList(filterA, filterB));
		List<Document> docs = MongoDAO.getInstance().findBy(dbName, collectionName, filter, pageNum, pageSize);
		return JSONArray.parseArray(JSON.toJSONString(docs), RequestEntity.class);
	}
	
}

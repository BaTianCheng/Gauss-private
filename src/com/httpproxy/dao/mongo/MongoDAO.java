package com.httpproxy.dao.mongo;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.UpdateResult;

/**
 * Mongo数据库操作类
 * @author wicks
 */
public class MongoDAO{

    private MongoClient mongoClient = null;
    private static final MongoDAO instance = new MongoDAO();

    private MongoDAO()
    {
        if (mongoClient == null)
        {
            MongoClientOptions.Builder buide = new MongoClientOptions.Builder();
            buide.connectionsPerHost(50);// 与目标数据库可以建立的最大链接数
            buide.connectTimeout(1000 * 60 * 20);// 与数据库建立链接的超时时间
            buide.maxWaitTime(100 * 60 * 5);// 一个线程成功获取到一个可用数据库之前的最大等待时间
            buide.threadsAllowedToBlockForConnectionMultiplier(100);
            buide.maxConnectionIdleTime(0);
            buide.maxConnectionLifeTime(0);
            buide.socketTimeout(0);
            buide.socketKeepAlive(true);
            MongoClientOptions myOptions = buide.build();
            
            MongoCredential credential = MongoCredential.createScramSha1Credential("jinying", "admin", "jinying".toCharArray());  
            List<MongoCredential> credentials = new ArrayList<MongoCredential>();  
            credentials.add(credential);
            ServerAddress serverAddress = new ServerAddress("localhost",27017);  
            
            try
            {
                mongoClient = new MongoClient(serverAddress, credentials, myOptions);
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    /**
     * 获取实例
     * @return
     */
    public static MongoDAO getInstance()
    {
        return instance;
    }

    /**
     * 获取数据库
     * @param dbName
     * @return
     */
    public MongoDatabase getDatabase(String dbName)
    {
        return mongoClient.getDatabase(dbName);
    }

    /**
     * 获取表集合
     * @param dbName
     * @param collectionName
     * @return
     */
    public MongoCollection<Document> getCollection(String dbName, String collectionName)
    {
    	MongoDatabase db = getDatabase(dbName);
        return db.getCollection(collectionName);
    }
    
    /**
     * 插入数据
     * @param dbName
     * @param collectionName
     * @param doc
     * @return
     */
    public boolean insert(String dbName, String collectionName, Document doc)
    {
    	MongoCollection<Document> dbCollection = getCollection(dbName, collectionName);
        long num = dbCollection.count();
        dbCollection.insertOne(doc);
        if (dbCollection.count() - num > 0)
        {
            return true;
        }
        return false;
    }
    
    /**
     * 查询所有文档 
     * @param dbName
     * @param collectionName
     * @return
     */
    public List<Document> findAll(String dbName, String collectionName) {  
        List<Document> results = new ArrayList<Document>();
        MongoCollection<Document> dbCollection = getCollection(dbName, collectionName);
        FindIterable<Document> iterables = dbCollection.find();  
        MongoCursor<Document> cursor = iterables.iterator();  
        while (cursor.hasNext()) {  
            results.add(cursor.next());  
        }
        return results;  
    }  
    
    /**
     * 分页查询文档 
     * @param dbName
     * @param collectionName
     * @return
     */
    public List<Document> findAll(String dbName, String collectionName, int pageNum, int pageSize) {  
        List<Document> results = new ArrayList<Document>();
        MongoCollection<Document> dbCollection = getCollection(dbName, collectionName);
        if(pageSize<0 || pageNum <0){
        	pageSize = 0;
        	pageNum = 0;
        }
        FindIterable<Document> iterables = dbCollection.find().skip((pageNum-1)*pageSize);  
        MongoCursor<Document> cursor = iterables.iterator();  
        while (cursor.hasNext()) {  
            results.add(cursor.next());  
        }
        return results;  
    } 
  
    /**
     * 按条件查询
     * @param dbName
     * @param collectionName
     * @param filter
     * @return
     */
    public List<Document> findBy(String dbName, String collectionName, Bson filter) {
        List<Document> results = new ArrayList<Document>();
        MongoCollection<Document> dbCollection = getCollection(dbName, collectionName);
        FindIterable<Document> iterables = dbCollection.find(filter);  
        MongoCursor<Document> cursor = iterables.iterator();  
        while (cursor.hasNext()) {  
            results.add(cursor.next());  
        }  
        return results;  
    }  
  

    /**
     * 更新
     * @param dbName
     * @param collectionName
     * @param filter
     * @param update
     * @return
     */
    public UpdateResult update(String dbName, String collectionName, Bson filter, Document update) {  
    	MongoCollection<Document> dbCollection = getCollection(dbName, collectionName);
        UpdateResult result = dbCollection.replaceOne(filter, update);  
        return result;  
    } 
  

    /**
     * 删除
     * @param dbName
     * @param collectionName
     * @param filter
     */
    public void delete(String dbName, String collectionName, Bson filter) {  
    	MongoCollection<Document> dbCollection = getCollection(dbName, collectionName);
    	dbCollection.deleteMany(filter);  
    }

}
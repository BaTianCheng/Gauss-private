package com.esb.guass.test;

import com.esb.guass.dispatcher.service.RequestService;

public class MongoTest {
	public static void main(String[] args) {
		/*
			Document document = new Document();  
	        document.append("name", "wang").append("gender", "female");  
	        MongoDb.insert(document);  
	        
	        Document filter = new Document();  
        	filter.append("name", "li si");  
        	List<Document> results = MongoDb.findBy(filter);  
	        
	        Document filter = new Document();  
	        filter.append("gender", "male");  
	        //注意update文档里要包含"$set"字段  
	        Document update = new Document();  
	        update.append("$set", new Document("gender", "female"));  
	        UpdateResult result = MongoDb.updateOne(filter, update);  
	        
	        Document filter = new Document();  
        	filter.append("name", "li");  
        	MongoDb.deleteOne(filter);  
	        
		 */
		/*
		RequestEntity requestEntity = new RequestEntity();
		RequestOption option = new RequestOption();
		requestEntity.setQuestId(UUID.randomUUID().toString());
		option.setBody(true);
		requestEntity.setRequestOption(option);
		Document documentA = new Document(JSONObject.parseObject(requestEntity.toString())) ;
		System.out.println(requestEntity.toString());
		System.out.println(JSONObject.parseObject(requestEntity.toString()));
		System.out.println(documentA);
		*/
		/*
		Document document = new Document();  
        document.append("name", "wang").append("gender", "female");  
        Document document2 = new Document();
        document2.append("name", "wanga");
        document2.append("obj", document);
        MongoDAO.getInstance().insert("db_ebs", "tb_request",document2);  
		
		System.out.println(MongoDAO.getInstance().findAll("db_ebs", "tb_request"));
		*/
		System.out.println(RequestService.findAll().get(0).getQuestId());
		System.out.println(RequestService.find("51c965bb-f01f-40ae-b4f6-70fbc28d6a01").getResult());

	}
}

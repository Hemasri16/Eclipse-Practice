package com.dxc.app;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


public class Demo_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MongoClient mongoClient= new MongoClient("localhost",27017);
		MongoDatabase mongoDatabase=mongoClient.getDatabase("dxc");
		MongoCollection<Document>mongoCollection= mongoDatabase.getCollection("employee");
		
		mongoCollection.deleteOne(new Document("name","Honey"));
		System.out.println("Document deleted sucessfully");
		mongoClient.close();

	}

}

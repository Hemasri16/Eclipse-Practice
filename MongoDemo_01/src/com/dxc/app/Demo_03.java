package com.dxc.app;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class Demo_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MongoClient mongoClient= new MongoClient("localhost",27017);
		MongoDatabase mongoDatabase=mongoClient.getDatabase("dxc");
		MongoCollection<Document>mongoCollection= mongoDatabase.getCollection("employee");
		
		mongoCollection.updateOne(
		              Filters.and(
		            		  Filters.eq("name", "puja"),
				              Filters.eq("dept","it")
						),		
						
						Updates.set("basicpay", "89778")
						);
		System.out.println("Document updated sucessfully");
		mongoClient.close();

	}

}

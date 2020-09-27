package com.dxc.app;

import java.util.ArrayList;
import java.util.Scanner;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;


public class Demo_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MongoClient mongoClient= new MongoClient("localhost",27017);
		MongoDatabase mongoDatabase=mongoClient.getDatabase("dxc");
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the collection name to insert");
		String CollectionName=scanner.next();
		
		if(mongoDatabase.listCollectionNames().into(new ArrayList<String>()).contains(CollectionName)) {
			MongoCollection<Document>mongoCollection=mongoDatabase.getCollection(CollectionName);
			Document document=new Document().append("id", "100")
					                        .append("name", "Pen")
					                        .append("title", "Java")
					                        .append("level", "Fresher");
			mongoCollection.insertOne(document);
			
			System.out.println("Document inserted successfully");
		}
		else {
			System.out.println("Collection is not existing, first create collection");
		}
		mongoClient.close();
}}

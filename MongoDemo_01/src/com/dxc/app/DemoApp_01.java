package com.dxc.app;

import java.util.Set;
import java.util.function.Consumer;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class DemoApp_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase mongoDatabase = mongoClient.getDatabase("dxc");
		MongoCollection<Document> collection = mongoDatabase.getCollection("employee");
		MongoCursor<Document> mongoCursor = collection.find(new Document().append("name", "lahari")).iterator();
		mongoCursor.forEachRemaining(DemoApp_01::display);
		mongoClient.close();
	}

			public static void display(Document document) {
				Set<String> keys = document.keySet();
				for (String Key : keys) {
					Object value = document.get(Key);
					System.out.println(Key + " : " + value);

				}
				System.out.println("---------------------------");

			}

	}



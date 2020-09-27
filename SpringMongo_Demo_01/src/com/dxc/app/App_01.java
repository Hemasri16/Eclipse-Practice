package com.dxc.app;

import java.text.ParseException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.dxc.beans.Student;

public class App_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

		MongoTemplate mongoTemplate = context.getBean(MongoTemplate.class);

		try {
			Student student = new Student(102, "puja", "16-06-2000", "puja@gm.com", "2345678");
			mongoTemplate.insert(student,"student");
			
			System.out.println("Document saved sucessfully");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of the program");
	}

}

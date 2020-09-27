package com.dxc.app;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


import com.dxc.beans.Student;

public class App_02{
	public static void main(String[] args) {
		Configuration configuration= new Configuration().configure();
		ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		SessionFactory sessionFactory= configuration.buildSessionFactory(serviceRegistry);
		
		Session session = sessionFactory.openSession();
		
		
		//Student student =(Student)session.get(Student. class,101);	
		
		//System.out.println("data obtained from table:"+ student);
		//Query query= (Query) session.createQuery("from Student");
		//List<Student> students= query.getResultList();
		
		//students.forEach(System.out::println);
		Student student=new Student(102,"pooja","pooja@gm.com","45678");
		
		session.beginTransaction();
		session.update(student);
		session.getTransaction().commit();
		session.close();
	}

}


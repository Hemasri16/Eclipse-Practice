package com.dxc.hibdaoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


import com.dxc.beans.Mark;
import com.dxc.beans.Student;

public class MarkHibDAO implements MarkDao {
	@Autowired
	SessionFactory sessionFactory ;
	Session session;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void openSession(){
		System.out.println("inside employeehibdao sessionFactory : "+sessionFactory);
		session = getSessionFactory().openSession();
	}
	
	public void closeSession(){
		session.close();
	}
	
	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public List<Mark> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mark find(int sid,int eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mark insert(Mark mark) {
		// TODO Auto-generated method stub
		System.out.println("Trying to insert : "+mark);
		session.save(mark);
		System.out.println("Inserted successfully : "+mark);
		return mark;
	}

	@Override
	public Mark udpate(Mark Mark) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int sid,int eid) {
		// TODO Auto-generated method stub
		return false;
	}

}

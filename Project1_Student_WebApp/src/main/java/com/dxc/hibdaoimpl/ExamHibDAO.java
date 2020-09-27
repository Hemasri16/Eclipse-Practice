package com.dxc.hibdaoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dxc.beans.Exam;
import com.dxc.beans.Student;

public class ExamHibDAO implements ExamDao {

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
		System.out.println("inside departmenthibdao sessionFactory : "+sessionFactory);
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
	public List<Exam> findAll() {
		// TODO Auto-generated method stub
		String sql = "from Exam";
		Query query = session.createQuery(sql);
		List<Exam> exam = query.list();
		return exam;
	}

	@Override
	public Exam find(int eid) {
		Exam exam = (Exam)session.get(Exam.class,eid);
		return exam;
	}

	@Override
	public Exam insert(Exam exam) {
		// TODO Auto-generated method stub
		System.out.println("Before inserting "+exam.getEname());
		session.save(exam);
		System.out.println("After inserting "+exam.getEname());
		return exam;
	}

	@Override
	public Exam udpate(Exam exam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int eid) {
		// TODO Auto-generated method stub
		return false;
	}

}
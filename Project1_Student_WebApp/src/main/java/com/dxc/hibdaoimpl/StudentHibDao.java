package com.dxc.hibdaoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dxc.beans.Student;

public class StudentHibDao implements StudentDao {

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
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		String sql = "from Student";
		Query query = session.createQuery(sql);
		List<Student> students = query.list();
		return students;
	}

	@Override
	public Student find(int sid) {
		Student student = (Student)session.get(Student.class,sid);
		return student;
	}

	@Override
	public Student insert(Student student) {
		// TODO Auto-generated method stub
		System.out.println("Before inserting "+student.getSname());
		session.save(student);
		System.out.println("After inserting "+student.getSname());
		return student;
	}

	@Override
	public Student udpate(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int sid) {
		// TODO Auto-generated method stub
		return false;
	}

}
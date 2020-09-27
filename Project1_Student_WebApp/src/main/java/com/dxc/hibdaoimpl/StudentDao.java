package com.dxc.hibdaoimpl;

import java.util.List;

import com.dxc.beans.Student;


public interface StudentDao {

	List<Student> findAll();
	Student find(int sid);
	Student insert(Student student);
	Student udpate(Student Student);
	boolean delete(int sid);
	
	
}


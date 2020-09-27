package com.dxc.hibdaoimpl;

import java.util.List;

import com.dxc.beans.Exam;


public interface ExamDao{
		
	
	
	List<Exam> findAll();
	Exam find(int eid);
	Exam insert(Exam exam);
	Exam udpate(Exam exam);
	boolean delete(int did);
	
}

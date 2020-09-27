package com.dxc.hibdaoimpl;

import java.util.List;

import com.dxc.beans.Mark;



public interface MarkDao {

	List<Mark> findAll();
	Mark find(int sid,int eid);
	Mark insert(Mark mark);
	Mark udpate(Mark mark);
	boolean delete(int sid,int eid);
	
}

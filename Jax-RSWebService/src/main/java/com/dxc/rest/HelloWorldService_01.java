package com.dxc.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dxc.beans.Student;

@Path("/hello")
public class HelloWorldService_01 {
	Map<Integer,Student>studMap=new HashMap<Integer,Student>();
	public HelloWorldService_01() {
		Student s1=new Student(100,"Hema","hema@gm.com","678976");
		Student s2=new Student(101,"Harshi","harshi@gm.com","12345");
		Student s3=new Student(102,"Puja","puja@gm.com","56789");
		studMap.put(s1.getId(),s1);
		studMap.put(s2.getId(),s2);
		studMap.put(s3.getId(),s3);
	}
	@GET
	@Path("/students/{id}")
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public Student getStudent(@PathParam("id")int id) {
		return studMap.get(id);
	}
	
	@GET
	@Path("/students")
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public List<Student> getStudents() {
		List<Student>students=new ArrayList<Student>();
		Set<Integer>ids=studMap.keySet();
		for(int id:ids) {
			students.add(studMap.get(id));
		}
		return students;
	}
}
	
	





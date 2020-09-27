package com.dxc.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxc.beans.Student;

public interface StudentRepository extends MongoRepository<Student,Integer>{
	

}

package com.dxc.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxc.beans.Student;

public interface StudentRepository extends MongoRepository<Student,Integer>{
	

}

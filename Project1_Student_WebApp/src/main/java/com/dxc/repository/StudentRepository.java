package com.dxc.repository;
 
import java.util.List;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.dxc.beans.Student;
 
public interface StudentRepository extends CrudRepository<Student, Integer> {
     
}
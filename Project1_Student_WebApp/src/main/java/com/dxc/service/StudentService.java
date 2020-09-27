package net.codejava.customer;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxc.beans.Student;
import com.dxc.repository.StudentRepository;
 
@Service
@Transactional
public class StudentService {
    @Autowired StudentRepository repo;
     
    public void save(Student student) {
        repo.save(student);
    }
     
    public List<Student> listAll() {
        return (List<Student>) repo.findAll();
    }
     
    public Student get(Long id) {
        return repo.findById(id).get();
    }
     
    public void delete(Long id) {
        repo.deleteById(id);
    }
     
}
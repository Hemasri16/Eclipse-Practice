package com.dxc.controller;
 
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dxc.beans.Student;
import com.dxc.service.StudentService;
 
 
@Controller
public class StudentController {
 
    @Autowired
    private StudentService studentService;
    @RequestMapping("/")
    public ModelAndView home() {
        List<Student> listStudent = studentService.listAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listCustomer", listStudent);
        return mav;
    }
    @RequestMapping("/new")
    public String newStudentForm(Map<String, Object> model) {
        Student student = new Student();
        model.put("student", student);
        return "new_student";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.save(student);
        return "redirect:/";
    }
    @RequestMapping("/edit")
    public ModelAndView editCustomerForm(@RequestParam long id) {
        ModelAndView mav = new ModelAndView("edit_student");
        Student student = studentService.get(id);
        mav.addObject("student", student);
     
        return mav;
    }
    @RequestMapping(value= {"/delete"})
    public String deleteCustomerForm(@RequestParam int id) {
        studentService.delete(id);
        return "redirect:/";       
    }
    
}
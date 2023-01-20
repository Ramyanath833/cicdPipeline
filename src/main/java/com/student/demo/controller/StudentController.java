package com.student.demo.controller;

import com.student.demo.entity.Student;
import com.student.demo.util.Studentutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    Studentutil studentutil;

    @GetMapping("/hello")
    public String welcome(){
        return "Welcome to Student app";
    }

    @GetMapping("/all")
    public List<Student> getAL(){
        return studentutil.getALl();
    }

    @GetMapping("{id}")
    public Student getById(@PathVariable int id){
        return studentutil.getById(id);
    }


}

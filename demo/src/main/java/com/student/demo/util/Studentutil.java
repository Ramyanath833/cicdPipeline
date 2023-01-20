package com.student.demo.util;

import com.student.demo.entity.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Studentutil {

    public List<Student> getALl(){
        List<Student> std = new ArrayList();
        std.add(new Student(1,"Ram","7","Math","Pass"));
        std.add(new Student(2,"Jeevan","8","Math","Pass"));
        std.add(new Student(3,"Doel","7","Science","Pass"));
        std.add(new Student(4,"Sarath","8","Math","Pass"));

        return std;
    }

    public Student getById(int id){
        List<Student> std = new ArrayList();
        std.add(new Student(1,"Ram","7","Math","Pass"));
        std.add(new Student(2,"Jeevan","8","Math","Pass"));
        std.add(new Student(3,"Doel","7","Science","Pass"));
        std.add(new Student(4,"Sarath","8","Math","Pass"));

        Student student = std.get(id);
        return student;
    }
}

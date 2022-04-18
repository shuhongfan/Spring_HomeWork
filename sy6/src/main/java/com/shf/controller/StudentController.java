package com.shf.controller;

import com.shf.pojo.Student;
import com.shf.service.StudentService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("StudentController")
public class StudentController {
    @Resource(name="studentService")
    private StudentService studentService;

    public void showStudentInfo(){
        studentService.showStudentInfo();
    }

    public void addStudent(Student student){
        studentService.addStudent(student);
    }
}

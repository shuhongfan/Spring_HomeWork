package com.shf.test;

import com.shf.controller.StudentController;
import com.shf.pojo.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

@Test
public class StudentTest {
    @Test
    public void showStudentInfo(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentController studentController = (StudentController) applicationContext.getBean("StudentController");

        studentController.showStudentInfo();
    }

    @Test
    public void addStudent(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentController studentController = (StudentController) applicationContext.getBean("StudentController");

        Student student = new Student(20220418, "张三", "软件工程");

        studentController.addStudent(student);
    }
}

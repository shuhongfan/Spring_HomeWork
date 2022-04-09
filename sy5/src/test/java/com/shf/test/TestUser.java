package com.shf.test;

import com.shf.sy5.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class TestUser {
    @Test
    public void testStu1(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        Student stu1 = (Student) applicationContext.getBean("stu1");
        System.out.println(stu1);
    }

    @Test
    public void testStu2(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        Student stu1 = (Student) applicationContext.getBean("stu2");
        System.out.println(stu1);
    }
}

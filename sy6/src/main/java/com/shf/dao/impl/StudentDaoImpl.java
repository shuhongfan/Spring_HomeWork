package com.shf.dao.impl;

import com.shf.dao.StudentDao;
import com.shf.pojo.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

@Repository("StudentDao")
public class StudentDaoImpl implements StudentDao {
    @Override
    public void showStudentInfo() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student s1 = (Student) applicationContext.getBean("student");
        System.out.println(s1);
    }

    @Override
    public void addStudent(Student student) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student s2 = (Student) applicationContext.getBean("student");
        System.out.println(s2);
    }
}

package com.shf.service.impl;

import com.shf.dao.StudentDao;
import com.shf.pojo.Student;
import com.shf.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource(name="StudentDao")
    private StudentDao studentDao;

    @Override
    public void showStudentInfo() {
        studentDao.showStudentInfo();
    }

    @Override
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }
}

package com.shf.sy8.service.impl;

import com.shf.sy8.dao.StudentDao;
import com.shf.sy8.pojo.Student;
import com.shf.sy8.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    public List<Student> getAllStudent(){
        return studentDao.getAllStudent();
    }

    @Override
    public int addStudent(Student student) {
        return studentDao.addStudent(student);
    }
}

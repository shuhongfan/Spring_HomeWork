package com.shf.sy8.service;

import com.shf.sy8.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudent();

    public int addStudent(Student student);
}

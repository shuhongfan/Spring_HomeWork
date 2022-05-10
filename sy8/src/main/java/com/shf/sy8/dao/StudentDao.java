package com.shf.sy8.dao;

import com.shf.sy8.pojo.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {

    @Select("select * from student")
    public List<Student> getAllStudent();

    @Insert("insert into student (username,password,course) values (#{username},#{password},#{course})")
    public int addStudent(Student student);
}

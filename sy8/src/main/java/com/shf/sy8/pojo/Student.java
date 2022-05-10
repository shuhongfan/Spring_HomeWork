package com.shf.sy8.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private String course;

    public Student(String username, String password, String course) {
        this.username = username;
        this.password = password;
        this.course = course;
    }
}

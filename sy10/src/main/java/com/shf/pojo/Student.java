package com.shf.pojo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Student {
    private String sno;
    private String sname;
    private Integer sex;
    private Date birthday;
    private List<Double> score;
}

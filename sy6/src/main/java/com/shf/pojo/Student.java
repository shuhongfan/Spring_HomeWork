package com.shf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component("student")
@Scope("singleton")
public class Student {
    @Value("021312")
    private Integer sno;
    @Value("张三")
    private String sname;
    @Value("软件工程")
    private String major;
}

package com.shf.sy8.test;

import com.shf.sy8.config.SpringConfig;
import com.shf.sy8.pojo.Student;
import com.shf.sy8.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Scanner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class LoginTest {
    @Autowired
    private StudentService studentService;

    List<Student> allStudent = null;

    private boolean flag = true;

    @Test
    public void test1() {
        Scanner scanner = new Scanner(System.in);
        while (flag){
            System.out.println("=============欢迎来到学生管理系统===============");
            System.out.println("请选择登录或注册：1-登录  2-注册  3-退出");
            String type = scanner.nextLine();
            if (type.equals("1")){
                boolean isFInd = false;
                allStudent = studentService.getAllStudent();
                System.out.println("=============登录系统=============");
                System.out.println("请输入用户名：");
                String username = scanner.nextLine();
                System.out.println("请输入 "+username+" 的密码：");
                String password = scanner.nextLine();

                for (Student student : allStudent) {
                    if (student.getUsername().equalsIgnoreCase(username)){
                        if (student.getPassword().equalsIgnoreCase(password)){
                            isFInd=true;
                            System.out.println("用户登录成功");
                            System.out.println(student.getUsername()+"是"+student.getCourse());
                        }
                    }
                }

                if (isFInd==false){
                    System.out.println("用户不存在或者用户名密码错误");
                }
            } else if (type.equals("2")){
                System.out.println("===================注册用户===================");
                System.out.println("请设置用户名：");
                String username = scanner.nextLine();
                System.out.println("请设置 "+username+" 的密码：");
                String password = scanner.nextLine();
                System.out.println("请设置 "+username+" 的班级：");
                String course = scanner.nextLine();
                if (username!=null && password!=null && course!=null){
                    Student student = new Student(username, password, course);
                    int res = studentService.addStudent(student);
                    if (res>=1){
                        System.out.println("学生添加成功，请登录");
                    } else {
                        System.out.println("学生添加失败，请重新注册");
                    }
                }
            } else if (type.equals("3")){
                flag=false;
            }
        }
    }
}

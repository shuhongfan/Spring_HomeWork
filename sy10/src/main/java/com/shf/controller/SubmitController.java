package com.shf.controller;

import com.shf.pojo.Student;
import com.shf.utils.CheckParametersUtil;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Arrays;

@Controller
public class SubmitController {
    @RequestMapping("/")
    public String toInput(){
        return "redirect:/input";
    }

    @RequestMapping("/input")
    public String input(HttpSession session){
        session.removeAttribute("isSubmit");
        return "input";
    }

    @RequestMapping("/submit")
    public String submit(Model model, Student student, HttpSession session){
        System.out.println(student);
        try {
            CheckParametersUtil.getInstance()
                            .put(student.getSno(), "sno")
                            .put(student.getSname(), "sname")
                            .put(student.getSex(), "sex")
                            .put(student.getBirthday(), "birthday")
                            .put(student.getScore(), "score")
                                    .checkParameter();
        } catch (Exception e) {
            model.addAttribute("errmsg",e.getMessage());
            return "redirect:/input";
        }

        model.addAllAttributes(BeanMap.create(student));
        session.setAttribute("isSubmit", "ok");
        return "show";
    }
}

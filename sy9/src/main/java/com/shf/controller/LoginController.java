package com.shf.controller;

import com.shf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {
    @RequestMapping("/")
    public String login(){
        return "login";
    }

    @RequestMapping("/login")
    public String index(Model model , User user){
        System.out.println(user);
        model.addAttribute("username",user.getUsername());
        model.addAttribute("password",user.getPassword());
        return "index";
    }
}

package com.shf.sy11.controller;

import com.shf.sy11.entity.User;
import com.shf.sy11.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    @GetMapping("/login")
    public String LoginPage(){
        return "login";
    }

    @GetMapping("/register")
    public String RegisterPage(){
        return "register";
    }

    @PostMapping("/login")
    public String Login(User user, Model model, HttpSession httpSession){
        System.out.println(user);
        int res = loginService.checkUserNameAndPassword(user.getUsername(), user.getPassword());
        if (res>=1){
            httpSession.setAttribute("flag", 1);
            return "loginSuccess";
        } else {
            model.addAttribute("errcode","1");
            return "redirect:/login";
        }
    }

    @PostMapping("/register")
    public String Register(User user,Model model ,HttpSession httpSession){
        System.out.println(user);
        int res = loginService.insertUserNameAndPassword(user.getUsername(), user.getPassword());
        if (res>=1){
            httpSession.setAttribute("flag", 1);
            return "success";
        }else {
            model.addAttribute("errcode","1");
            return "redirect:/register";
        }

    }
}

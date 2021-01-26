package com.example.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    public String login(){
        return "登录成功";
    }

    public void logout(){
        String str =  "注销成功";
    }
}

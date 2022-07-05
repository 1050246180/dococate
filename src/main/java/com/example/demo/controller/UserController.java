package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    /**
     * 获取模拟数据
     * @return
     */
    @RequestMapping("/data")
    public String data(){
        System.out.println("16===================data==============");
        return "hello word";
    }
    public String login(){
        return "登录成功";
    }

    public void logout(){
        String str =  "注销成功";
    }
}

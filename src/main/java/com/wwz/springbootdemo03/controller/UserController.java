package com.wwz.springbootdemo03.controller;

import com.wwz.springbootdemo03.pojo.User;
import com.wwz.springbootdemo03.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImpl userServiceImpl;

    // 登录
    @RequestMapping("/login")
    public String login(User user) {
        return userServiceImpl.login(user);
    }

    // 注册
    @PostMapping("/register")
    public String register(User user) {
        return userServiceImpl.register(user);
    }

    // 解决查询数据库中文出现乱码问题
    @RequestMapping(value = "/alluser", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public List<User> findAll() {
        return userServiceImpl.findAll();
    }
}

package com.wwz.springbootdemo03.service;

import com.wwz.springbootdemo03.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 登录
     * @param user
     * @return
     */
    public String login(User user);

    /**
     * 注册
     * @param user
     * @return
     */
    public String register(User user);

    /**
     * 获取所有用户
     * @return
     */
    public List<User> findAll();
}

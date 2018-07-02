package com.manggo.service;

import org.springframework.stereotype.Service;

/**
 * ClassName UserLoginService
 * Author: 周加辉
 * Date: 2018/6/22
 * Version 1.0
 * Description: 用户登录 Service
 */
@Service
public class UserLoginService {
    public String home() {
        System.err.println("home");
        return "123";
    }
}

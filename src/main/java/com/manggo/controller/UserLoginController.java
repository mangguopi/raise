package com.manggo.controller;

import com.manggo.common.dic.ReturnCode;
import com.manggo.common.model.ActionResult;
import com.manggo.model.paramin.UserLoginParamIn;
import com.manggo.model.paramout.UserLoginParamOut;
import com.manggo.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName UserLoginController
 * Author: 周加辉
 * Date: 2018/6/22
 * Version 1.0
 * Description: 用户登录 Controller
 */
@RestController
@RequestMapping("/test")
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @Value("${business.name}")
    private String name;

    @Value("${business.age}")
    private String age;

    @Value("${business.concate}")
    private String concate;

    @RequestMapping(value = "qqq")
    public String get() {
        return userLoginService.home().toString();
    }

    @RequestMapping(value = "post")
    public ActionResult<UserLoginParamOut> post(@RequestBody UserLoginParamIn param) {
        UserLoginParamOut userLoginParamOut = new UserLoginParamOut();
        userLoginParamOut.setUserId(param.getMobile());
        userLoginParamOut.setToken("123");
        userLoginParamOut.setRefreshToken("321");
        return new ActionResult<UserLoginParamOut>(ReturnCode.SUCCESS, "贼鸡儿成功", userLoginParamOut);

    }

}

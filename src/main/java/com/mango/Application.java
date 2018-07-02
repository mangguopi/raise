package com.mango;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

/**
 * ClassName Application
 * Author: 周加辉
 * Date: 2018/6/22
 * Version 1.0
 * Description: springBoot 项目启动类
 */
@Controller
@SpringBootApplication(scanBasePackages = {"com.mango.*"})
public class Application {

    public static void main(String[] args) {
        System.err.println("开始启动 SpringBoot");
        SpringApplication.run(Application.class, args);
        System.err.println("SpringBoot 启动完毕");
    }

}

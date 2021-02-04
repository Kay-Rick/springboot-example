/*
 * @Author: Kay_Rick@outlook.com
 * @Date: 2021-01-29 19:49:25
 * @LastEditors: Kay_Rick@outlook.com
 * @LastEditTime: 2021-02-04 22:15:51
 * @Description: 测试读取配置文件
 */
package com.rick.bootdemo.controller;

import com.google.gson.Gson;
import com.rick.bootdemo.component.bean.Person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
    
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Value("${my-profile.name}")
    String name;

    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public String handle() {
        log.info("my-profile.name：{}", name);
        log.info("person: {}", new Gson().toJson(person));
        return "Hello SpringBoot!";
    }

    @RequestMapping("/mockmvc")
    public String handle(@RequestParam String username) {
        log.info("username：{}", username);
        return "Hello " + username;
    }
}

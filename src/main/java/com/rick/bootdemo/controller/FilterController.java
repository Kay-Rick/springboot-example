/*
 * @Author: Kay_Rick@outlook.com
 * @Date: 2021-01-30 15:28:17
 * @LastEditors: Kay_Rick@outlook.com
 * @LastEditTime: 2021-01-31 13:28:33
 * @Description: 测试注册的自定义Filter
 */
package com.rick.bootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filter")
public class FilterController {
    
    @GetMapping("/hello")
    public String getHello() {
        return "Hello";
    }
}

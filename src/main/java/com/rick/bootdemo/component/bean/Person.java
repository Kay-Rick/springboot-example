/*
 * @Author: Kay_Rick@outlook.com
 * @Date: 2021-01-29 21:02:37
 * @LastEditors: Kay_Rick@outlook.com
 * @LastEditTime: 2021-02-04 22:11:47
 * @Description: 测试读取配置文件装载Bean
 */
package com.rick.bootdemo.component.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    
    private String username;

    private Integer age;

    private Double salary;
}

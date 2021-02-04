/*
 * @Author: Kay_Rick@outlook.com
 * @Date: 2021-01-30 15:45:46
 * @LastEditors: Kay_Rick@outlook.com
 * @LastEditTime: 2021-02-04 22:12:52
 * @Description: 测试加入监听器
 */
package com.rick.bootdemo.component.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyListener implements ServletContextListener {
    
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("初始化项目完成");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("项目销毁");
    }
}

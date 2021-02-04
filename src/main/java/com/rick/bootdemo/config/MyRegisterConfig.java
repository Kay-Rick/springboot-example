/*
 * @Author: Kay_Rick@outlook.com
 * @Date: 2021-01-30 16:00:36
 * @LastEditors: Kay_Rick@outlook.com
 * @LastEditTime: 2021-01-31 22:03:04
 * @Description: 配置Servlet原生API
 */
package com.rick.bootdemo.config;

import java.util.ArrayList;
import java.util.Arrays;

import com.rick.bootdemo.component.filter.MyFilter1;
import com.rick.bootdemo.component.filter.MyFilter2;
import com.rick.bootdemo.component.listener.MyListener;
import com.rick.bootdemo.component.servlet.MyServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRegisterConfig {
    
    @Autowired
    MyFilter1 myFilter1;

    @Autowired
    MyFilter2 myFilter2;

    @Autowired
    MyListener myListener;

    @Autowired
    MyServlet myServlet;
    
    @Bean
    public ServletListenerRegistrationBean<MyListener> setUpListener() {
        ServletListenerRegistrationBean<MyListener> servletListenerRegistrationBean = new ServletListenerRegistrationBean<>();
        servletListenerRegistrationBean.setOrder(1);
        servletListenerRegistrationBean.setListener(myListener);
        servletListenerRegistrationBean.setEnabled(true);
        return servletListenerRegistrationBean;
    }    
    
    @Bean
    public FilterRegistrationBean<MyFilter1> setUpFilter1() {
        FilterRegistrationBean<MyFilter1> filterRegistrationBean = new FilterRegistrationBean<>();
        // setOrder()中数值越小，优先级越高，则会先执行
        filterRegistrationBean.setOrder(1);
        filterRegistrationBean.setFilter(myFilter1);
        filterRegistrationBean.setUrlPatterns(new ArrayList<>(Arrays.asList("/ajax/*")));
        return filterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean<MyFilter2> setUpFilter2() {
        FilterRegistrationBean<MyFilter2> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setOrder(2);
        filterRegistrationBean.setFilter(myFilter2);
        filterRegistrationBean.setUrlPatterns(new ArrayList<>(Arrays.asList("/filter/*")));
        return filterRegistrationBean;
    }

    @Bean
    public ServletRegistrationBean<MyServlet> setUpServlet() {
        ServletRegistrationBean<MyServlet> servletRegistrationBean = new ServletRegistrationBean<>();
        servletRegistrationBean.setServlet(myServlet);
        servletRegistrationBean.setEnabled(true);
        servletRegistrationBean.setUrlMappings(new ArrayList<>(Arrays.asList("/myServlet")));
        return servletRegistrationBean;
    }
}

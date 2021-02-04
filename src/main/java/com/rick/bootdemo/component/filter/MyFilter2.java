/*
 * @Author: Kay_Rick@outlook.com
 * @Date: 2021-01-30 15:19:09
 * @LastEditors: Kay_Rick@outlook.com
 * @LastEditTime: 2021-02-04 22:12:31
 * @Description: 测试加入过滤器2
 */
package com.rick.bootdemo.component.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyFilter2 implements Filter {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("初始化过滤器{}...", "MyFilter2");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws IOException, ServletException {
        log.info("过滤器{}开始对请求进行预处理：{}", "MyFilter2", req.getRemoteAddr());
        chain.doFilter(req, resp);
        log.info("过滤器{}请求处理完毕...", "MyFilter2");
    }

    @Override
    public void destroy() {
        log.info("过滤器{}销毁...", "MyFilter2");
    }
}

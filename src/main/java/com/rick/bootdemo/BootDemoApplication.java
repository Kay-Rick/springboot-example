package com.rick.bootdemo;

import com.rick.bootdemo.component.profile.ProfileProperties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.rick.bootdemo.component")
@EnableConfigurationProperties(ProfileProperties.class)
public class BootDemoApplication implements InitializingBean {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	private final ProfileProperties profileProperties;

	public BootDemoApplication(ProfileProperties profileProperties) {
		this.profileProperties = profileProperties;
	}
	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication.class, args);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("配置文件读取完成：{}", profileProperties.toString());
	}
	
}

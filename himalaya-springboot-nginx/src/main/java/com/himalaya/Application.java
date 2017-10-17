package com.himalaya;

import java.net.URL;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.util.ClassUtils;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年7月25日 下午5:45:47
* Description
*/
@ComponentScan 
@EnableAutoConfiguration
@EnableScheduling
@Configuration
@SpringBootApplication
public class Application {

	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		String path = ClassUtils.getDefaultClassLoader().getResource("").getPath();
		LOGGER.info("Path " + path);
		URL url = Thread.currentThread().getContextClassLoader().getResource("application.properties");
		LOGGER.info("url " + url.getPath());
		SpringApplication.run(Application.class, args);
		LOGGER.info("Spring Boot Has Been Started...");
	}
}
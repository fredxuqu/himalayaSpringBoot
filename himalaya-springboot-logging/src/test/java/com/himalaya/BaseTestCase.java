package com.himalaya;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

//import lombok.extern.slf4j.Slf4j;

/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2017年7月26日 上午9:14:08 Description
 * 
 * @RunWith 这是JUnit的注解，通过这个注解让SpringRunner这个类提供Spring测试上下文。
 * @SpringBootTest(classes = Application.class) 这是Spring Boot注解，为了进行集成测试，需要通过这个注解加载和配置Spring应用上下
 * 	1.4之前的配置是@RunWith(SpringJUnit4ClassRunner.class)
 * 				@SpringApplicationConfiguration(classes = SpringJUnitTestApplication.class)  
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
//@Slf4j
public class BaseTestCase {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Test
	public void testLogging(){
		//TRACE < DEBUG < INFO < WARN < ERROR < FATAL
		logger.trace("TRACE: {}" , "This is a trace message");
		logger.debug("Debug: {}" , "This is a debug message");
		logger.info("Info: {}" , "This is an info message");
		logger.warn("Warn: {}" , "This is a warn message");
		logger.error("Error: {}" , "This is an error message");
	}
}
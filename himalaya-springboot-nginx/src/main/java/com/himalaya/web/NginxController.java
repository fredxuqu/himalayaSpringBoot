package com.himalaya.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.himalaya.Application;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年10月16日 上午11:22:11
* Description
*/
@RestController
@RequestMapping("/admin")
public class NginxController {

	private static final Logger LOGGER = LoggerFactory.getLogger(NginxController.class);
	
	@RequestMapping("/login")
	public void getUsers(HttpServletRequest request, String userName) {
		
		LOGGER.info("Login .... " + userName);
		
		String ip = request.getHeader("X-Forwarded-For");  
        if (LOGGER.isInfoEnabled()) {  
        	LOGGER.info("getIpAddress(HttpServletRequest) - X-Forwarded-For - String ip=" + ip);  
        }
        
        String realIP = request.getHeader("X-Real-IP");  
        if (LOGGER.isInfoEnabled()) {  
        	LOGGER.info("getIpAddress(HttpServletRequest) - X-Real-IP - String Real IP=" + realIP);  
        }
	}
	
	@RequestMapping("/test")
	public String test(HttpServletRequest request, String userName) {
		
		LOGGER.info("Login .... " + userName);
		
		return userName;
	}
}

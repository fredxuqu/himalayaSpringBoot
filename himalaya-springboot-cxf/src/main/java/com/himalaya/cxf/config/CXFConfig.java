package com.himalaya.cxf.config;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.endpoint.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.himalaya.cxf.service.CXFService;
import com.himalaya.cxf.service.impl.CXFServiceImpl;

/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2019年7月4日 上午11:55:49 Description
 */
@Configuration
public class CXFConfig {
	@Bean
	public ServletRegistrationBean dispatcherServlet() {
		return new ServletRegistrationBean(new CXFServlet(), "/cxf/*");
	}

	@Bean(name = Bus.DEFAULT_BUS_ID)
	public SpringBus springBus() {
		return new SpringBus();
	}

	@Bean
	public CXFService cxfService() {
		return new CXFServiceImpl();
	}

//	@Bean
//	public Endpoint endpoint() {
//		EndpointImpl endpoint = new EndpointImpl(springBus(), cxfService());
//		endpoint.publish("/user");
//		return endpoint;
//	}
}
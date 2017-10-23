package com.himalaya.cros;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年10月23日 上午9:46:14
* Description
*/
@Configuration
public class CustomCorsConfiguration {

	protected static final Logger LOGGER = LoggerFactory.getLogger(CustomCorsConfiguration.class);
	
	@Value("${cros.host}")
	String crosHost;
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		
		LOGGER.info("Configure Cros : " + crosHost);
		
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				LOGGER.info("Web Configurer Adapter Cros Host : " + crosHost);
				registry.addMapping("/springbootdemo/**").allowedOrigins(crosHost);
			}
		};
	}
}

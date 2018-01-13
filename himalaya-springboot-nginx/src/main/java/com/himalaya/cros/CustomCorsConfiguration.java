package com.himalaya.cros;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

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
    public FilterRegistrationBean corsFilter() {  
		
		LOGGER.info("Filter Registration Cros : " + crosHost);
		
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();  
        CorsConfiguration config = new CorsConfiguration();  
        config.setAllowCredentials(true);  
//        config.addAllowedOrigin(crosHost);  
        config.addAllowedOrigin(CorsConfiguration.ALL);
        config.addAllowedHeader(CorsConfiguration.ALL);
        config.addAllowedMethod(CorsConfiguration.ALL);
        source.registerCorsConfiguration("/springbootdemo/**", config);  
        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));  
        bean.setOrder(Ordered.HIGHEST_PRECEDENCE);  
        return bean;  
    }
}

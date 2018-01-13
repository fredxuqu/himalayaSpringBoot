package com.himalaya.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import redis.clients.jedis.JedisPoolConfig;

/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2017年9月5日 下午2:01:10 Description
 */
@Configuration
//@EnableCaching
@EnableAutoConfiguration
public class RedisConfig extends CachingConfigurerSupport {

	private static final Logger LOGGER = LoggerFactory.getLogger(RedisConfig.class);

	@Bean
	public JedisPoolConfig getRedisConfig() {
		JedisPoolConfig config = new JedisPoolConfig();
		return config;
	}

	@Bean
	@ConfigurationProperties(prefix = "spring.redis")
	public JedisConnectionFactory getConnectionFactory() {
		JedisConnectionFactory factory = new JedisConnectionFactory();
		JedisPoolConfig config = getRedisConfig();
		factory.setPoolConfig(config);
		LOGGER.info("JedisConnectionFactory bean init success.");
		return factory;
	}

	@Bean
	public StringRedisTemplate getStringRedisTemplate() {
		StringRedisTemplate template = new StringRedisTemplate(getConnectionFactory());
		LOGGER.info("Jedis get StringRedisTemplate " + template.hashCode());
		return template;
	}
	
	@Bean
	public RedisTemplate<?, ?> getRedisTemplate() {
		RedisTemplate<?, ?> template = new RedisTemplate<String, Integer>();
		template.setConnectionFactory(getConnectionFactory());
		return template;
	}
}
package com.himalaya.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisNode;
import org.springframework.data.redis.connection.RedisSentinelConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

import redis.clients.jedis.JedisPoolConfig;

/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2018年1月24日 下午3:37:12 Description
 */
@Configuration
@EnableConfigurationProperties(RedisConfigSetting.class)
public class RedisPoolConfig {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RedisPoolConfig.class);

	@Autowired
	RedisConfigSetting redisConfigSetting;

	/**
	 * redis哨兵配置
	 * 
	 * @return
	 */
	@Bean
	public RedisSentinelConfiguration redisSentinelConfiguration() {
		
		RedisSentinelConfiguration configuration = new RedisSentinelConfiguration();
		String[] host = redisConfigSetting.getSentinelNodes().split(",");
		for (String redisHost : host) {
			String[] item = redisHost.split(":");
			String ip = item[0];
			String port = item[1];
			configuration.addSentinel(new RedisNode(ip, Integer.parseInt(port)));
		}
		configuration.setMaster(redisConfigSetting.getSentinelMaster());
		LOGGER.info("RedisSentinelConfiguration intialized.");
		return configuration;
	}
	
	@Bean
    public JedisPoolConfig redisPoolFactory() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(redisConfigSetting.getMaxIdle());
        jedisPoolConfig.setMaxWaitMillis(redisConfigSetting.getMaxWait());
        jedisPoolConfig.setMinIdle(redisConfigSetting.getMinIdle());
        jedisPoolConfig.setMaxTotal(redisConfigSetting.getMaxActive());
        LOGGER.info("JedisPoolConfig intialized.");
        return jedisPoolConfig;
    }

	/**
	 * 连接redis的工厂类
	 */
	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {
		
		JedisConnectionFactory factory = new JedisConnectionFactory(redisSentinelConfiguration());
		factory.setHostName(redisConfigSetting.getHost());
		factory.setPort(redisConfigSetting.getPort());
		factory.setTimeout(redisConfigSetting.getTimeout());
		factory.setPassword(redisConfigSetting.getPassword());
		factory.setDatabase(redisConfigSetting.getDatabase());
		factory.setPoolConfig(redisPoolFactory());
		
		LOGGER.info("JedisConnectionFactory intialized.");
		return factory;
	}
	
	/**
	 * 连接redis的工厂类,单机版
	 */
//	@Bean
	public JedisConnectionFactory jedisConnectionFactoryStandalone() {
		
		JedisConnectionFactory factory = new JedisConnectionFactory();
		factory.setHostName(redisConfigSetting.getHost());
		factory.setPort(redisConfigSetting.getPort());
		factory.setTimeout(redisConfigSetting.getTimeout());
		factory.setPassword(redisConfigSetting.getPassword());
		factory.setDatabase(redisConfigSetting.getDatabase());
		factory.setPoolConfig(redisPoolFactory());
		
		LOGGER.info("JedisConnectionFactory standalone mode intialized.");
		return factory;
	}
	
	
	/**
     * 配置RedisTemplate
     * 设置添加序列化器
     * key 使用string序列化器
     * value 使用Json序列化器
     * 还有一种简答的设置方式，改变defaultSerializer对象的实现。
     * @return
     */
    @Bean
    public RedisTemplate<String, Object> redisTemplate() {
        //StringRedisTemplate的构造方法中默认设置了stringSerializer
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        //set key serializer
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        template.setKeySerializer(stringRedisSerializer);
        template.setHashKeySerializer(stringRedisSerializer);

        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);

        jackson2JsonRedisSerializer.setObjectMapper(objectMapper);
        //set value serializer
        template.setDefaultSerializer(jackson2JsonRedisSerializer);

        template.setConnectionFactory(jedisConnectionFactory());
        template.afterPropertiesSet(); 
        return template;
    }
}

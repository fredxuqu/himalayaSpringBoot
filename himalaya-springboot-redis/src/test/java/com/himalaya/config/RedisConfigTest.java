package com.himalaya.config;

import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import com.himalaya.BaseTestCase;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年11月2日 上午9:02:22
* Description
*/
public class RedisConfigTest extends BaseTestCase {
	
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    
    @Test
    public void testCacheString() throws Exception {
    	try {
    		System.out.println("-------------------------");
    		LOGGER.info("Jedis get StringRedisTemplate " + redisTemplate.hashCode());
    		redisTemplate.opsForValue().set("aaa", "111");
            Assert.assertEquals("111", redisTemplate.opsForValue().get("aaa"));
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    @Test
    public void testCache() throws Exception {
    	try {
    		System.out.println("-------------------------");
    		LOGGER.info("Jedis get StringRedisTemplate " + redisTemplate.hashCode());
    		redisTemplate.opsForValue().set("test", "55555");
            Assert.assertEquals("55555", redisTemplate.opsForValue().get("test"));
		} catch (Exception e) {
			e.printStackTrace();
		}
    }	
    
    @Test
    public void testObject() throws Exception {
    	try {
    		System.out.println("-------------------------");
    		LOGGER.info("Jedis get StringRedisTemplate " + redisTemplate.hashCode());
    		redisTemplate.opsForValue().set("testobj", new JSONObject("{\"id\":\"fred\"}"));
    		LOGGER.info(redisTemplate.opsForValue().get("testobj").toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
    }	
}
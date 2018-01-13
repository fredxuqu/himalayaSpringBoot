package com.himalaya.config;

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
    private RedisTemplate<String, String> redisTemplate;
    
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
}
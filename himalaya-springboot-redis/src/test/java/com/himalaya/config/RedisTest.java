package com.himalaya.config;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import com.himalaya.BaseTestCase;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年9月5日 下午2:22:51
* Description
*/
public class RedisTest extends BaseTestCase {
 
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    
    @Test
    public void test() throws Exception {
    	try {
    		System.out.println("-------------------------");
            stringRedisTemplate.opsForValue().set("aaa", "111");
            Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    
    @Test
    public void testRedisTemplate() throws Exception {
    	try {
    		System.out.println("-------------------------");
            redisTemplate.opsForValue().set("1", "fred");
            Assert.assertEquals("fred", redisTemplate.opsForValue().get("1"));
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    @Test
    public void testRedisTemplate1() throws Exception {
    	try {
    		System.out.println("-------------------------");
            redisTemplate.opsForHash().put("group", "sub1", "fred");
            redisTemplate.opsForHash().put("group", "sub1", "wendy");
            Object value = redisTemplate.opsForHash().get("group", "sub1");
            System.out.println(value.toString());
            Assert.assertEquals("wendy", redisTemplate.opsForHash().get("group", "sub1"));
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
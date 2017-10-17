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
    public void testCacheString() throws Exception {
    	try {
    		System.out.println("-------------------------");
            stringRedisTemplate.opsForValue().set("aaa", "111");
            Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    @Test
    public void testCacheInteger() throws Exception {
    	try {
    		System.out.println("-------------------------");
            stringRedisTemplate.opsForValue().set("count", "1");
            stringRedisTemplate.opsForValue().increment("count", 1);
            System.out.println(stringRedisTemplate.opsForValue().get("count"));
            Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    @Autowired
    private RedisTemplate<String, Integer> redisTemplate;
    
    @Test
    public void testRedisTemplate() throws Exception {
    	try {
    		System.out.println("-------------------------");
            redisTemplate.opsForValue().set("size", 1);
            Integer size = redisTemplate.opsForValue().get("size");
            System.out.println(size);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    @Test
    public void testRedisTemplate2() throws Exception {
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
    
    @Test
    public void testRedisTemplate3() throws Exception {
    	try {
    		System.out.println("-------------------------");
            redisTemplate.opsForHash().put("group", "sub1", 1);
            redisTemplate.opsForHash().put("group", "sub1", 2);
            Object obj = redisTemplate.opsForHash().get("group", "sub1");
            if(obj instanceof Integer){
            	Integer value = (Integer)obj;
            	System.out.println(value);
            }            
            Assert.assertEquals(2, redisTemplate.opsForHash().get("group", "sub1"));
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
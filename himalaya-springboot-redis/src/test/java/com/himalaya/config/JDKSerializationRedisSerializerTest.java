package com.himalaya.config;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.test.context.junit4.SpringRunner;

import ch.qos.logback.core.net.SyslogOutputStream;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2018年9月13日 下午2:48:50
* Description
*/
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class JDKSerializationRedisSerializerTest {

//	@Autowired
//	RedisTemplate<String, Object> redisTemplate;
	
	@Test
	public void testSerialize(){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key1", 1000l);
		map.put("key2", "foo");
		
		JdkSerializationRedisSerializer serializer = new JdkSerializationRedisSerializer();
		byte[] b = serializer.serialize(map);
		
		Object object = serializer.deserialize(b);
		Map<String, Object> deMap = (Map<String, Object>)object;
		System.out.println(deMap);
		
		User user = new User(1, "foo");
		byte[] userByte = serializer.serialize(user);
		User dUser = (User)serializer.deserialize(userByte);
		System.out.println(dUser);
		
		List list = null;
		System.out.println(list.isEmpty());
	}
}

class User implements Serializable {
	private int i;
	private String flag;
	
	public User() {
	}
	
	public User(int i, String flag) {
		super();
		this.i = i;
		this.flag = flag;
	}
	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}
	/**
	 * @param i the i to set
	 */
	public void setI(int i) {
		this.i = i;
	}
	/**
	 * @return the flag
	 */
	public String getFlag() {
		return flag;
	}
	/**
	 * @param flag the flag to set
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	@Override
	public String toString() {
		return "i=" + i +", flag=" + this.flag;
	}
}

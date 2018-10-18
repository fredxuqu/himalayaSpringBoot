package com.himalaya.service;

import java.math.BigDecimal;

import org.apache.rocketmq.spring.starter.core.RocketMQTemplate;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.support.MessageBuilder;

import com.himalaya.BaseTestCase;
import com.himalaya.domain.OrderEvent;
import com.himalaya.service.producer.DemoProducer;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年7月26日 上午11:05:36
* Description
*/
public class DemoProducerTest extends BaseTestCase {
	
	@Value("${spring.rocketmq.topic.log}")
	private String topic;
	
	@Value("${spring.rocketmq.tag.log}")
	private String tag;
	
	@Autowired
	DemoProducer demoProducer;
	
	@Autowired
	RocketMQTemplate rocketMQTemplate;
	
	@Test
	public void test(){
		System.out.println("==========================");
	}
	
	@Test
	public void testSendMessage(){
		demoProducer.sendMessage(new OrderEvent("10011",new BigDecimal(1011)));
	}
	
	@Test
	public void testConvertAndSendStr() throws Exception {
		rocketMQTemplate.convertAndSend(topic, "Hello World");
	}
	
	@Test
	public void testConvertAndSendObject() throws Exception {
		OrderEvent orderDO = new OrderEvent("100",new BigDecimal(100));
		rocketMQTemplate.convertAndSend(topic, orderDO);
	}
	
	@Test
	public void testSend() throws Exception {
		rocketMQTemplate.send(topic, MessageBuilder.withPayload("Hello, I am from Spring Message").build());
	}
	
	@Test
	public void testConvertAndSendWithTag() throws Exception {
		rocketMQTemplate.convertAndSend(topic + ":" + tag, "Hello, I am from Tag 00");
		rocketMQTemplate.convertAndSend(topic + ":" + tag, "Hello, I am from Tag 01");
	}
}

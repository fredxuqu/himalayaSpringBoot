package com.himalaya.service.producer;

import javax.annotation.Resource;

import org.apache.rocketmq.spring.starter.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.himalaya.domain.OrderEvent;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver;
import lombok.extern.slf4j.Slf4j;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2018年9月27日 上午10:15:08
* Description
*/
@Slf4j
@Service
public class DemoProducer {
	
	@Value("${spring.rocketmq.topic.log}")
	private String topic;
	
	@Resource
    private RocketMQTemplate rocketMQTemplate;
	
	public void sendMessage(OrderEvent orderEvent){
		log.info("Send Message : " + JSON.toJSONString(orderEvent));
		try {
			rocketMQTemplate.convertAndSend(topic, orderEvent);
		} catch (MessagingException e) {
			log.error("Send Message Failed");
			try {
				Thread.currentThread().sleep(5000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			rocketMQTemplate.convertAndSend(topic, orderEvent);
		}
	}
}

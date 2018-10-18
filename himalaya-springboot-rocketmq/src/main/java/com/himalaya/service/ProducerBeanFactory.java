package com.himalaya.service;

import java.util.Properties;

import javax.annotation.PostConstruct;

import org.apache.rocketmq.client.producer.MQProducer;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalaya.config.RocketMQConfig;
import com.himalaya.constants.PropertyKeyConstant;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2018年9月27日 上午10:22:30
* Description
*/
//@Component
public class ProducerBeanFactory {

	@Autowired
	RocketMQConfig rocketMQConfig; 
	
	private static MQProducer producer;
	
	private static class SingletonHolder{
		private final static ProducerBeanFactory INSTANCE = new ProducerBeanFactory();
	}
	
	private ProducerBeanFactory(){
		
	}
	
	public final static ProducerBeanFactory getInstance(){
		return SingletonHolder.INSTANCE;
	}
	
	@PostConstruct
	public void init(){
		Properties properties = new Properties();
		properties.setProperty(PropertyKeyConstant.MQ_KEY_ONSADDR, rocketMQConfig.getNameServerAddress());
		properties.setProperty(PropertyKeyConstant.MQ_KEY_PRODUCER_ID, rocketMQConfig.getProducerID());
	}
}

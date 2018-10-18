package com.himalaya.service.consumer;

import org.apache.rocketmq.spring.starter.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.starter.core.RocketMQListener;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.himalaya.domain.OrderEvent;

import lombok.extern.slf4j.Slf4j;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2018年9月27日 上午10:14:43
* Description
*/
@Slf4j
@Service
@RocketMQMessageListener(topic = "${spring.rocketmq.topic.log}", consumerGroup = "${spring.rocketmq.consumer.group}_order")
public class DemoOrderEventConsumer implements RocketMQListener<OrderEvent>{

	@Override
	public void onMessage(OrderEvent event) {
		log.info("Received OrderEvent is " + JSON.toJSONString(event));
	}
}

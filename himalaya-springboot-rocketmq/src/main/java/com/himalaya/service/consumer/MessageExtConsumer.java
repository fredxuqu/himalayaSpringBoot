package com.himalaya.service.consumer;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.common.UtilAll;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.spring.starter.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.starter.core.RocketMQListener;
import org.apache.rocketmq.spring.starter.core.RocketMQPushConsumerLifecycleListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2018年9月27日 下午2:45:31
* Description
*/
@Slf4j
@Service
@RocketMQMessageListener(topic = "${spring.rocketmq.topic.log}", 
						 selectorExpress = "${spring.rocketmq.tag.log}", 
						 consumerGroup = "${spring.rocketmq.consumer.group}")
public class MessageExtConsumer implements RocketMQListener<MessageExt>, RocketMQPushConsumerLifecycleListener {
    @Override
    public void onMessage(MessageExt message) {
        log.info("MessageExtConsumer received message, msgId:{}, body:{} ", message.getMsgId(), new String(message.getBody()));
    }

    @Override
    public void prepareStart(DefaultMQPushConsumer consumer) {
        // set consumer consume message from now
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_TIMESTAMP);
        consumer.setConsumeTimestamp(UtilAll.timeMillisToHumanString3(System.currentTimeMillis()));
    }
}
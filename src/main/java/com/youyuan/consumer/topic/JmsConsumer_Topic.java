package com.youyuan.consumer.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;
import javax.jms.Topic;

/**
 * @author zhangy
 * @version 1.0
 * @description
 * @date 2019/12/27 9:13
 */
@Component
public class JmsConsumer_Topic {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @JmsListener(destination = "${mytopic}")
    public void recive(TextMessage textMessage) throws JMSException {
        System.out.println("消费者接收到生产者消息是:" + textMessage.getText());
    }
}

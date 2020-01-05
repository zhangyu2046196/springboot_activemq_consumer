package com.youyuan.consumer.queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * @author zhangy
 * @version 1.0
 * @description
 * @date 2019/12/27 8:44
 */
@Component
public class JmsConsumer {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @JmsListener(destination = "${myqueue}")
    public void receive(TextMessage textMessage) throws JMSException {
        System.out.println("消费者通过监听方式接收消息:"+textMessage.getText());
    }
}

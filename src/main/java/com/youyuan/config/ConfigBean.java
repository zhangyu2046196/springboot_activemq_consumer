package com.youyuan.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

/**
 * @author zhangy
 * @version 1.0
 * @description   自定义配置类
 * @date 2019/12/27 8:42
 */
@Configuration
@EnableJms   //开启ActiveMQ基于注解的功能
public class ConfigBean {
    @Value("${myqueue}")
    private String queueName;

    @Bean
    public ActiveMQQueue queue(){
        return new ActiveMQQueue(queueName);
    }
}

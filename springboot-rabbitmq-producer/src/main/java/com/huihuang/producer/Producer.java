package com.huihuang.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Producer {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMsg(String queueName){
        //创建消息
        String msg = "my_fanout_msg:" + new Date();
        amqpTemplate.convertAndSend(queueName, msg);
    }
}

package com.huihuang.producer;

import com.alibaba.fastjson.JSON;
import com.raiden.rabbitmq.dto.MQMessage;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Producer {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMsg(String queueName, MQMessage mqMessage){
        amqpTemplate.convertAndSend(queueName, JSON.toJSONString(mqMessage));
    }
}

package com.huihuang.consumer;

import com.alibaba.fastjson.JSON;
import com.raiden.rabbitmq.dto.MQMessage;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout_email_queue")
public class FanoutEmailConsumer {

    @RabbitHandler
    public void proess(String msg){
        MQMessage message = JSON.parseObject(msg, MQMessage.class);
        System.err.println("fanout_email:" + msg);
        System.err.println("ID:" + message.getId());
        System.err.println("CODE:" + message.getCode());
    }
}

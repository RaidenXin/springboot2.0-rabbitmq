package com.huihuang.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout_sms_queue")
public class FanoutSmsConsumer {

    @RabbitHandler
    public void proess(String msg){
        System.err.println("anout_sms" + msg);
    }
}

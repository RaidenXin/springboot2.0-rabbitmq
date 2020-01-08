package com.huihuang.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout_email_queue")
public class FanoutEmailConsumer {

    @RabbitHandler
    public void proess(String msg){
        System.err.println("fanout_email:" + msg);
    }
}

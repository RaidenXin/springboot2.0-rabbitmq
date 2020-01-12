package com.huihuang.controller;

import com.huihuang.producer.Producer;
import com.raiden.rabbitmq.dto.MQMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    private Producer producer;

    @GetMapping("/send")
    public String send(String queueName){
        MQMessage mqMessage = new MQMessage();
        mqMessage.setId("255136147");
        mqMessage.setCode("afasdfdsafdsafasfdf");
        producer.sendMsg(queueName, mqMessage);
        return "Success";
    }
}

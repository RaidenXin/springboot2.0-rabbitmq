package com.huihuang.controller;

import com.huihuang.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    private Producer producer;

    @GetMapping("/send")
    public String send(String queueName){
        producer.sendMsg(queueName);
        return "Success";
    }
}

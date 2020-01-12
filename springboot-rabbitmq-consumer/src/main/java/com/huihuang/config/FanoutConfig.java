package com.huihuang.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class FanoutConfig {

    // email 队列名称
    private String FANOUT_EMAIL_QUEUE = "fanout_email_queue";
    // 短信队列名称
    private String FANOUT_SMS_QUEUE = "fanout_sms_queue";
    // 交换机名称
    private String EXCHANGE_NAME = "fanoutExchange";

    // 1.生成队列
    @Bean
    public Queue fanOutEmailQueue() {
        return new Queue(FANOUT_EMAIL_QUEUE);
    }

    @Bean
    public Queue fanOutSmsQueue() {
        return new Queue(FANOUT_SMS_QUEUE);
    }

    // 2. 生成交换机
    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange(EXCHANGE_NAME);
    }

    // 3.将email队列和交换机绑定
    @Bean
    Binding bindingExchangeEamil(Queue fanOutEmailQueue, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(fanOutEmailQueue).to(fanoutExchange);
    }

    // 4.将短信队列和交换机绑定
    @Bean
    Binding bindingExchangeSms(Queue fanOutSmsQueue, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(fanOutSmsQueue).to(fanoutExchange);
    }
}

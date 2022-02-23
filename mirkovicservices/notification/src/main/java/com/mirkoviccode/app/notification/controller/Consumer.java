package com.mirkoviccode.app.notification.controller;

import com.mirkoviccode.app.notification.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Consumer {

    @RabbitListener(queues = "queue.A")
    private void receiveA(Message message){
        log.info("Message received form QUEUE A->{}",message);
    }

    @RabbitListener(queues = "queue.B")
    private void receiveB(Message message){
        log.info("Message received form QUEUE B->{}",message);
    }

}

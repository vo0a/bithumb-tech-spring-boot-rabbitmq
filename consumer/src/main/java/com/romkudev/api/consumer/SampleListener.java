package com.romkudev.api.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class SampleListener {

    @RabbitListener(queues = "sample.queue")
    public void receiveMessage(final Message message) { // 메시지가 중간에 변경되면 안되기 때문에 final 처리
        System.out.println(" ###################### ");
        System.out.println(message.toString());
    }
}

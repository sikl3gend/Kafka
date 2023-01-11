package com.sikl3gend.kafka.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "sikl3gend", groupId = "groupId1")
    void listener(String data){
        System.out.println("Listener received: " + data);
    }
}

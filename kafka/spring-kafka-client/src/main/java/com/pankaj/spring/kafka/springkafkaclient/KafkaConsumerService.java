package com.pankaj.spring.kafka.springkafkaclient;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "my-topic", groupId = "my-spring-group")
    public void consume(String message) {
        System.out.println("Received message from Kafka: " + message);
    }
}

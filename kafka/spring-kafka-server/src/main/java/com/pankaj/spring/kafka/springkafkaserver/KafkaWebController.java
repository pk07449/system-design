package com.pankaj.spring.kafka.springkafkaserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaWebController {

    private final KafkaProducerService producerService;

    public KafkaWebController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    // Endpoint exposed to the browser
    @GetMapping("/send")
    public String sendFromBrowser(@RequestParam("msg") String message) {
        producerService.sendMessage("my-topic", message);
        return "Message successfully sent to Kafka: " + message;
    }
}

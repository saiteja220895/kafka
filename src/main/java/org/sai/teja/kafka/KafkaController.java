package org.sai.teja.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaProducerService producerService;

    @GetMapping("/send/{message}")
    public String sendMessage(@PathVariable String message) {
        producerService.sendMessage(message);
        return "Message sent: " + message;
    }
}

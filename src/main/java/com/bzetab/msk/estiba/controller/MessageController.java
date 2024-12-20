package com.bzetab.msk.estiba.controller;

import com.bzetab.msk.estiba.service.JmsProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/messages")
public class MessageController {

    @Autowired
    private JmsProducer jmsProducer;

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        jmsProducer.sendMessage("user.queue", message);
        return "Message sent: " + message;
    }
}
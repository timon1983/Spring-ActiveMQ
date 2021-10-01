package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("activemq")
public class ActiveMQController {

    @Autowired
    JmsTemplate jmsTemplate;

    @GetMapping(value = "/send/{message}" , produces = "text/html")
    public String sendMessage(@PathVariable("message") String message){
        jmsTemplate.convertAndSend("mynewqueue", message);
        return "done";
    }
}

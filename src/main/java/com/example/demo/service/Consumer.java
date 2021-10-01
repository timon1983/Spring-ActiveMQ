package com.example.demo.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @JmsListener(destination = "mynewqueue")
    public void recieveMessage(String message){
        System.out.println(message);
    }

}

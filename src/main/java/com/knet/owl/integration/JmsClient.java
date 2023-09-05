package com.knet.owl.integration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsClient {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void send(String message) {

        jmsTemplate.convertAndSend("jms.message.endpoint", message);

    }


}

package com.knet.owl.listener;

import lombok.extern.log4j.Log4j2;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
@Log4j2
public class JmsMessageListener {

    @JmsListener(destination = "jms.message.endpoint")
    public void receiveMessage(String msg) {
        log.info("Incoming message ----------> {}", msg);
    }

}

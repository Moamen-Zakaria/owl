package com.knet.owl;

import com.knet.owl.integration.JmsClient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Controller {

    private JmsClient jmsClient;

    @GetMapping("/send/{message}")
    public void sendMessage(@PathVariable String message) {

        jmsClient.send(message);

    }


}

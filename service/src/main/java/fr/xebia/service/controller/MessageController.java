package fr.xebia.service.controller;

import fr.xebia.service.client.MessageServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Value("${custom-message}")
    private String message;


    private final MessageServiceClient client;

    @Autowired
    public MessageController(MessageServiceClient client) {
        this.client = client;
    }

    @GetMapping("/client/message")
    public String getClientMessage() {
        return client.getMessage();
    }

    @GetMapping("/message")
    public String getMessage() {
        return message;
    }
}

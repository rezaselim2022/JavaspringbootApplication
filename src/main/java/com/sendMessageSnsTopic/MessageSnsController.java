package com.sendMessageSnsTopic;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MessageSnsController {
private final MessagePublisherService messagePublisherService;

    public MessageSnsController(MessagePublisherService messagePublisherService) {
        this.messagePublisherService = messagePublisherService;
    }

    @PostMapping("/message")
    public String publishMessage(@RequestBody String message){
        return messagePublisherService.publishMessage(message);
    }
}

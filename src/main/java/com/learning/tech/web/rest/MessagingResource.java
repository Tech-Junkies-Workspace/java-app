package com.learning.tech.web.rest;

import com.learning.tech.service.MessagingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MessagingResource {

    private final MessagingService messagingService;

    public MessagingResource(MessagingService messagingService) {
        this.messagingService = messagingService;
    }

    @PostMapping("/message")
    public void saveMessage() {
    }

    @PutMapping("/message")
    public void updateMessage() {
    }

    @GetMapping("/message")
    public String getMessage() {
        return messagingService.getMessage();
    }

    @DeleteMapping("/message")
    public void deleteMessage() {
    }
}

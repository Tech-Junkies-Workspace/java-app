package com.learning.tech.web.rest;

import com.learning.tech.service.MessageService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MessageResource {

    private final MessageService messageService;

    public MessageResource(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/message")
    public void saveMessage() {
    }

    @PutMapping("/message")
    public void updateMessage() {
    }

    @GetMapping("/message")
    public String getMessage() {
        return messageService.getMessage();
    }

    @DeleteMapping("/message")
    public void deleteMessage() {
    }
}

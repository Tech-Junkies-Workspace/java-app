package com.learning.tech.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private static final String MESSAGE = "Hello World";

    public String getMessage() {
        return MESSAGE;
    }
}

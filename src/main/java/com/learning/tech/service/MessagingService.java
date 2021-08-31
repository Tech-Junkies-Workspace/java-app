package com.learning.tech.service;

import org.springframework.stereotype.Service;

@Service
public class MessagingService {

    private static final String MESSAGE = "Hello World, this is v2.0";

    public String getMessage() {
        return MESSAGE;
    }
}

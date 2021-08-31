package com.learning.tech.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MessagingServiceTests {

    @InjectMocks
    MessagingService messagingService;

    @Test
    public void the_get_message_function_should_return_hello_world_when_called() {
        String expectedMessage = messagingService.getMessage();
        String actualMessage = "Hello World, this is v2.0";
        assertEquals(actualMessage, expectedMessage);
    }
}

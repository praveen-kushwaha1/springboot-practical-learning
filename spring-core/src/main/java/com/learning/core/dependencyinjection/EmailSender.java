package com.learning.core.dependencyinjection;

import org.springframework.stereotype.Component;

/** Concrete email implementation discovered by component scanning. */
@Component("emailSender")
public class EmailSender implements MessageSender {
    @Override
    public String send(String message) {
        return "EMAIL: " + message;
    }
}

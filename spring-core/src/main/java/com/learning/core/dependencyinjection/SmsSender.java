package com.learning.core.dependencyinjection;

import org.springframework.stereotype.Component;

/** Second implementation demonstrates ambiguity when multiple beans exist. */
@Component("smsSender")
public class SmsSender implements MessageSender {
    @Override
    public String send(String message) {
        return "SMS: " + message;
    }
}

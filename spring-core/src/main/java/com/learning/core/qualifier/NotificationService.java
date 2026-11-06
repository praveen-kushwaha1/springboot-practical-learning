package com.learning.core.qualifier;

import com.learning.core.dependencyinjection.MessageSender;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/** Constructor injection plus @Qualifier selects one implementation explicitly. */
@Service
public class NotificationService {
    private final MessageSender sender;

    public NotificationService(@Qualifier("emailSender") MessageSender sender) {
        this.sender = sender;
    }

    public String notifyUser(String message) {
        return sender.send(message);
    }
}

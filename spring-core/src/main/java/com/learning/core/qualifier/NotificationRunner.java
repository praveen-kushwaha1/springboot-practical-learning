package com.learning.core.qualifier;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/** Runs once after the Spring context starts so the DI example is visible. */
@Component
public class NotificationRunner implements CommandLineRunner {
    private final NotificationService notificationService;

    public NotificationRunner(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void run(String... args) {
        System.out.println(notificationService.notifyUser("Spring Core is running"));
    }
}

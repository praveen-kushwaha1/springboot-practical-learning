package com.learning.boot.configurationproperties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/** Prints values bound from external configuration at startup. */
@Component
public class AppInfoRunner implements CommandLineRunner {
    private final AppInfoProperties properties;

    public AppInfoRunner(AppInfoProperties properties) {
        this.properties = properties;
    }

    @Override
    public void run(String... args) {
        System.out.println(properties.title() + " | " + properties.level());
    }
}

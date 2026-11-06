package com.learning.boot;

import com.learning.boot.configurationproperties.AppInfoProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppInfoProperties.class)
public class SpringBootBasicsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootBasicsApplication.class, args);
    }
}

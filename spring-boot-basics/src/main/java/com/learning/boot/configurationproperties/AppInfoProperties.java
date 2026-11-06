package com.learning.boot.configurationproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/** Binds the app.info prefix from application.yml to a typed Java object. */
@ConfigurationProperties(prefix = "app.info")
public record AppInfoProperties(String title, String level) {
}

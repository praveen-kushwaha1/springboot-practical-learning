package com.learning.core.dependencyinjection;

/** Contract for a notification channel; clients depend on this abstraction. */
public interface MessageSender {
    String send(String message);
}

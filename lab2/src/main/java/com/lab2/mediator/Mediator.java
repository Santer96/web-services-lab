package com.lab2.mediator;

public interface Mediator {
    void notify(String action, String... parameters);
}

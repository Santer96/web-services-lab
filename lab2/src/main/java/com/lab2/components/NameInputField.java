package com.lab2.components;

import com.lab2.mediator.Mediator;

public class NameInputField implements UIComponent {

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setActive(boolean value) {
        System.out.println("Name input field is active: " + value);
    }

    public void enterName(String name) {
        System.out.println("Name entered: " + name);
        mediator.notify("name", name);
    }
}

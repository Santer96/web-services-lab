package com.lab2.components;

import com.lab2.mediator.Mediator;

public class PhoneInputField implements UIComponent {

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setActive(boolean value) {
        System.out.println("Phone input field is active: " + value);
    }

    public void enterPhone(String phone) {
        System.out.println("Phone entered: " + phone);
        mediator.notify("phone", phone);
    }
}

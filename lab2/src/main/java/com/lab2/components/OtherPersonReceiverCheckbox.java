package com.lab2.components;

import com.lab2.mediator.Mediator;

public class OtherPersonReceiverCheckbox implements UIComponent {

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setActive(boolean value) {
        System.out.println("'Other person receiver' checkbox is active: " + value);
    }

    public void checkBox(boolean check) {
        System.out.println("'Other person receiver' checkbox checked: " + check);
        mediator.notify("otherReceiver", String.valueOf(check));
    }
}

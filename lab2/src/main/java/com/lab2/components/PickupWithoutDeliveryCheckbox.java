package com.lab2.components;

import com.lab2.mediator.Mediator;

public class PickupWithoutDeliveryCheckbox implements UIComponent {

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setActive(boolean value) {
        System.out.println("'Pickup without delivery' checkbox is active: " + value);
    }

    public void checkBox(boolean check) {
        System.out.println("'Pickup without delivery' checkbox checked: " + check);
        mediator.notify("pickup", String.valueOf(check));
    }
}

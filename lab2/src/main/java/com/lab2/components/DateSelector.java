package com.lab2.components;

import com.lab2.mediator.Mediator;

public class DateSelector implements UIComponent {

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setActive(boolean value) {
        System.out.println("Date selector is active: " + value);
    }

    public void selectDate(String date) {
        System.out.println("Date selected: " + date);
        mediator.notify("date", date);
    }
}

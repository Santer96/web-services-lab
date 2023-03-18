package com.lab2.components;

import com.lab2.mediator.Mediator;

public class TimeSelector implements UIComponent {

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setActive(boolean value) {
        System.out.println("Time selector is active: " + value);
    }

    public void showAvailableTimeForDate(String date) {
        System.out.println("Displaying available time slots for date - " + date);
    }

    public void selectTime(String time) {
        System.out.println("Time selected: " + time);
        mediator.notify("time", time);
    }
}

package com.lab3.memento;

import java.util.Calendar;

public class NotificationConfigMemento implements Memento {

    private final String name;
    private final Calendar date;

    private final boolean newsNotification;
    private final boolean advertisementNotification;
    private final boolean ordersNotification;

    public NotificationConfigMemento(boolean newsNotification, boolean advertisementNotification, boolean ordersNotification) {
        this.newsNotification = newsNotification;
        this.advertisementNotification = advertisementNotification;
        this.ordersNotification = ordersNotification;
        this.date = Calendar.getInstance();
        this.name = String.format("news:%b;adv:%b;order:%b", newsNotification, advertisementNotification, ordersNotification);
    }

    public boolean isNewsNotification() {
        return newsNotification;
    }

    public boolean isAdvertisementNotification() {
        return advertisementNotification;
    }

    public boolean isOrdersNotification() {
        return ordersNotification;
    }

    public String getName() {
        return name;
    }

    public Calendar getDate() {
        return date;
    }
}

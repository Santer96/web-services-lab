package com.lab3.data;

import com.lab3.memento.Memento;
import com.lab3.memento.NotificationConfigMemento;

public class NotificationConfig implements Preservable {

    private boolean newsNotification;
    private boolean advertisementNotification;
    private boolean ordersNotification;

    public Memento save() {
        return new NotificationConfigMemento(newsNotification, advertisementNotification, ordersNotification);
    }

    public void restore(Memento memento) {
        NotificationConfigMemento notificationConfigMemento = (NotificationConfigMemento) memento;
        this.newsNotification = notificationConfigMemento.isNewsNotification();
        this.advertisementNotification = notificationConfigMemento.isAdvertisementNotification();
        this.ordersNotification = notificationConfigMemento.isOrdersNotification();
    }

    public NotificationConfig(boolean newsNotification, boolean advertisementNotification, boolean ordersNotification) {
        this.newsNotification = newsNotification;
        this.advertisementNotification = advertisementNotification;
        this.ordersNotification = ordersNotification;
    }

    public boolean isNewsNotification() {
        return newsNotification;
    }

    public void setNewsNotification(boolean newsNotification) {
        this.newsNotification = newsNotification;
    }

    public boolean isAdvertisementNotification() {
        return advertisementNotification;
    }

    public void setAdvertisementNotification(boolean advertisementNotification) {
        this.advertisementNotification = advertisementNotification;
    }

    public boolean isOrdersNotification() {
        return ordersNotification;
    }

    public void setOrdersNotification(boolean ordersNotification) {
        this.ordersNotification = ordersNotification;
    }
}

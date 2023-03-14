package com.lab1.message;

import com.lab1.entity.User;

public class EmailNotificator implements Notificator {

    @Override
    public void notify(User user, String message) {
        System.out.println("SEND notification via e-mail to user " + user + ":");
        System.out.println(message);
    }
}

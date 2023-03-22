package com.lab3;

import com.lab3.data.NotificationConfig;
import com.lab3.memento.Caretaker;

public class Main {

    public static void main(String[] args) {
        NotificationConfig notificationConfig = new NotificationConfig(true, true, true);
        Caretaker caretaker = new Caretaker(notificationConfig);
        caretaker.backup();
        caretaker.history();
//        news:true;adv:true;order:true

        System.out.println("<===>");

        notificationConfig.setNewsNotification(false);
        caretaker.backup();

        notificationConfig.setAdvertisementNotification(false);
        caretaker.backup();
        caretaker.history();
//        news:false;adv:false;order:true
//        news:false;adv:true;order:true
//        news:true;adv:true;order:true

        System.out.println("<===>");

        caretaker.undo();
        caretaker.undo();
        System.out.println(notificationConfig.isAdvertisementNotification());
        caretaker.history();
//        true
//        news:true;adv:true;order:true
    }
}

package com.lab4.notification.sms;

public class SmsImpl implements Sms {

    public void sendSms(String phone, String sender, String title, String message) {
        System.out.println("Send sms to '" + phone + "' from '" + sender + "' with title '"
                + title + "' and message '" + message + "'.");
    }
}

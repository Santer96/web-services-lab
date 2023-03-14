package com.lab4;

import com.lab4.notification.Notification;
import com.lab4.notification.email.EmailNotification;
import com.lab4.notification.slack.Slack;
import com.lab4.notification.slack.SlackImpl;
import com.lab4.notification.slack.SlackNotificationAdapter;
import com.lab4.notification.sms.Sms;
import com.lab4.notification.sms.SmsImpl;
import com.lab4.notification.sms.SmsNotificationAdapter;

public class Demo {

    public static void main(String[] args) {
        // email
        Notification emailNotification = new EmailNotification("admin@gmail.com");
        emailNotification.send("emailTitle", "some message");
        // OUTPUT: Sent email with title 'emailTitle' to 'admin@gmail.com' that says 'some message'.

        // Slack
        Slack slack = new SlackImpl("Slack-login", "apikey:12345");
        Notification slackNotification = new SlackNotificationAdapter(slack, "chat5");
        slackNotification.send("Slack-title", "slack message");
        // OUTPUT: Slack user 'Slack-login', apiKey 'apikey:12345' send message to chat 'chat5' with title 'Slack-title' and message 'slack message'.

        // SMS
        Sms sms = new SmsImpl();
        Notification smsNotification = new SmsNotificationAdapter(sms, "+380671234567", "me");
        smsNotification.send("SMS-title", "SMS message");
        // OUTPUT: Send sms to '+380671234567' from 'me' with title 'SMS-title' and message 'SMS message'.
    }
}

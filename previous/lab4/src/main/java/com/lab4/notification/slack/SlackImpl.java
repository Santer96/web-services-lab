package com.lab4.notification.slack;

public class SlackImpl implements Slack {

    private final String login;
    private final String apiKey;

    public SlackImpl(String login, String apiKey) {
        this.login = login;
        this.apiKey = apiKey;
    }

    public void sendMessage(String chatId, String title, String message) {
        System.out.println("Slack user '" + login + "', apiKey '" + apiKey + "' send message to chat '"
                + chatId + "' with title '" + title + "' and message '" + message + "'.");
    }

    public String getLogin() {
        return login;
    }

    public String getApiKey() {
        return apiKey;
    }
}

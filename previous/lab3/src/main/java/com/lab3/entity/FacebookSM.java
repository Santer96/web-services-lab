package com.lab3.entity;

public class FacebookSM implements SocialMedia {

    private final String login;
    private final String password;

    public FacebookSM(String login, String password) {
        // Sign in social media
        this.login = login;
        this.password = password;
    }

    public void publishMessage(String message) {
        System.out.println(login + " posted in Facebook: " + message);
    }
}

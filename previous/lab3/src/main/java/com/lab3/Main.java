package com.lab3;

import com.lab3.entity.SocialMedia;
import com.lab3.factoryMethod.FacebookCreator;
import com.lab3.factoryMethod.LinkedInCreator;
import com.lab3.factoryMethod.SocialMediaCreator;

public class Main {

    public static void main(String[] args) {
        final String socialMediaName = "facebook"; // facebook or linkedIn

        SocialMediaCreator socialMediaCreator;
        switch (socialMediaName) {
            case "facebook":
                socialMediaCreator = new FacebookCreator();
                break;
            case "linkedIn":
                socialMediaCreator = new LinkedInCreator();
                break;
            default:
                throw new IllegalStateException("Wrong social media parameter " + socialMediaName);
        }
        SocialMedia socialMedia = socialMediaCreator.create("Login", "Password");
        socialMedia.publishMessage("Some message"); // Login posted in Facebook: Some message
    }
}

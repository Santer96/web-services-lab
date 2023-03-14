package com.lab3.factoryMethod;

import com.lab3.entity.FacebookSM;
import com.lab3.entity.SocialMedia;

public class FacebookCreator extends SocialMediaCreator {

    public SocialMedia create(String login, String password) {
        return new FacebookSM(login, password);
    }
}

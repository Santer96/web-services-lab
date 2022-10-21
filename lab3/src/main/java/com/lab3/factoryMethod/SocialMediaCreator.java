package com.lab3.factoryMethod;

import com.lab3.entity.SocialMedia;

public abstract class SocialMediaCreator {

    public abstract SocialMedia create(String login, String password);
}

package com.lab10.hrml.form;

import com.lab10.hrml.Component;

public class PasswordInputComponent implements Component {

    private final String name;

    public PasswordInputComponent(String name) {
        this.name = name;
    }

    public void render() {
        System.out.println("Rendering password field with name " + name);
    }
}

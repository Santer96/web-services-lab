package com.lab10.hrml.form;

import com.lab10.hrml.Component;

public class TextInputComponent implements Component {

    private final String name;

    public TextInputComponent(String name) {
        this.name = name;
    }

    public void render() {
        System.out.println("Rendering text field with name " + name);
    }
}

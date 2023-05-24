package com.lab10.hrml.form;

import com.lab10.hrml.Component;

public class SubmitButtonComponent implements Component {

    private final String name;

    public SubmitButtonComponent(String name) {
        this.name = name;
    }

    public void render() {
        System.out.println("Rendering submit button with name " + name);
    }
}

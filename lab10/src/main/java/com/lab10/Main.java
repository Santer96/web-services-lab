package com.lab10;

import com.lab10.hrml.Component;
import com.lab10.hrml.CompositeComponent;
import com.lab10.hrml.form.CheckboxInputComponent;
import com.lab10.hrml.form.FormCompositeComponent;
import com.lab10.hrml.form.PasswordInputComponent;
import com.lab10.hrml.form.SubmitButtonComponent;
import com.lab10.hrml.form.TextInputComponent;

public class Main {
    public static void main(String[] args) {
        // Initialize component
        CompositeComponent form = new FormCompositeComponent("checkout");
        Component name = new TextInputComponent("name");
        Component password = new PasswordInputComponent("password");
        Component ageCheck = new CheckboxInputComponent("ageCheck");

        CompositeComponent addressDiv = new FormCompositeComponent("address section");
        Component city = new TextInputComponent("city");
        Component street = new TextInputComponent("street");
        Component building = new TextInputComponent("building");

        Component submit = new SubmitButtonComponent("order");

        // Setup tree
        form.addComponent(name);
        form.addComponent(password);
        form.addComponent(ageCheck);
        form.addComponent(addressDiv);
        addressDiv.addComponent(city);
        addressDiv.addComponent(street);
        addressDiv.addComponent(building);
        form.addComponent(submit);

        // Test
        form.render();

//        Rendering form with name checkoutand inner components: {
//            Rendering text field with name name
//            Rendering password field with name password
//            Rendering checkbox with name ageCheck
//            Rendering form with name address sectionand inner components: {
//                Rendering text field with name city
//                Rendering text field with name street
//                Rendering text field with name building
//            }
//            Rendering submit button with name order
//        }

    }
}

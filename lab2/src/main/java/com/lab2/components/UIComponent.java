package com.lab2.components;

import com.lab2.mediator.Mediator;

public interface UIComponent {
    void setMediator(Mediator mediator);
    void setActive(boolean value);
}

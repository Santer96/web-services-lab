package com.lab6.entity;

import com.lab6.visitor.Visitor;

public interface Element {
    void accept(Visitor visitor);
}

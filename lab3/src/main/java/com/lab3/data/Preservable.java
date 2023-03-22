package com.lab3.data;

import com.lab3.memento.Memento;

public interface Preservable {
    Memento save();
    void restore(Memento memento);
}

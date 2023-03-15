package com.lab1.iterator;

import com.lab1.entity.Place;

import java.util.List;

public class UserIterator implements Iterator {

    private final List<Place> places;
    private int pointer = 0;

    public UserIterator(List<Place> places) {
        this.places = places;
    }

    public boolean hasNext() {
        return pointer < places.size();
    }

    public Place getNext() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException();
        }
        Place place = places.get(pointer);
        pointer++;
        return place;
    }
}

package com.lab1.iterator;

import com.lab1.entity.Place;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NavigatorIterator implements Iterator {

    private final List<Place> places;
    private int pointer = 0;

    public NavigatorIterator(List<Place> places) {
        // sort by navigator rating
        this.places = places.stream()
                .sorted(Comparator.comparingInt(Place::getNavigatorRating))
                .collect(Collectors.toList());
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

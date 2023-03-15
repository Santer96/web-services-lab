package com.lab1.collection;

import com.lab1.entity.Place;
import com.lab1.iterator.GuideIterator;
import com.lab1.iterator.Iterator;
import com.lab1.iterator.NavigatorIterator;
import com.lab1.iterator.UserIterator;

import java.util.ArrayList;
import java.util.List;

public class TouristCollection implements TouristIterable {

    private final List<Place> places = new ArrayList<>();

    public void add(Place place) {
        places.add(place);
    }

    public void get(int index) {
        places.get(index);
    }

    @Override
    public Iterator getUserIterator() {
        return new UserIterator(new ArrayList<>(places));
    }

    @Override
    public Iterator getNavigatorIterator() {
        return new NavigatorIterator(new ArrayList<>(places));
    }

    @Override
    public Iterator getGuideIterator() {
        return new GuideIterator(new ArrayList<>(places));
    }
}

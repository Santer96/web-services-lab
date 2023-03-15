package com.lab1.collection;

import com.lab1.iterator.Iterator;

public interface TouristIterable {

    Iterator getUserIterator();
    Iterator getNavigatorIterator();
    Iterator getGuideIterator();
}

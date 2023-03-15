package com.lab1;

import com.lab1.collection.TouristCollection;
import com.lab1.entity.Place;
import com.lab1.iterator.Iterator;

public class Main {

    public static void main(String[] args) {
        Place timesSquare = new Place("Times Square", 2, 3);
        Place statueOfLiberty = new Place("Statue of liberty", 3, 1);
        Place centralPark = new Place("Central park", 1, 2);

        TouristCollection collection = new TouristCollection();
        collection.add(timesSquare);
        collection.add(statueOfLiberty);
        collection.add(centralPark);

        Iterator userIterator = collection.getUserIterator();
        while (userIterator.hasNext()) {
            System.out.println(userIterator.getNext());
        }
//        Place{name='Times Square', navigatorRating=2, guideRating=3}
//        Place{name='Statue of liberty', navigatorRating=3, guideRating=1}
//        Place{name='Central park', navigatorRating=1, guideRating=2}

        Iterator navIterator = collection.getNavigatorIterator();
        while (navIterator.hasNext()) {
            System.out.println(navIterator.getNext());
        }
//        Place{name='Central park', navigatorRating=1, guideRating=2}
//        Place{name='Times Square', navigatorRating=2, guideRating=3}
//        Place{name='Statue of liberty', navigatorRating=3, guideRating=1}

        Iterator guideIterator = collection.getGuideIterator();
        while (guideIterator.hasNext()) {
            System.out.println(guideIterator.getNext());
        }
//        Place{name='Statue of liberty', navigatorRating=3, guideRating=1}
//        Place{name='Central park', navigatorRating=1, guideRating=2}
//        Place{name='Times Square', navigatorRating=2, guideRating=3}
    }
}

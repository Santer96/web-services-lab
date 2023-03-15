package com.lab1.entity;

public class Place {

    private final String name;
    private final int navigatorRating;
    private final int guideRating;

    public Place(String name, int navigatorRating, int guideRating) {
        this.name = name;
        this.navigatorRating = navigatorRating;
        this.guideRating = guideRating;
    }

    public String getName() {
        return name;
    }

    public int getNavigatorRating() {
        return navigatorRating;
    }

    public int getGuideRating() {
        return guideRating;
    }

    @Override
    public String toString() {
        return "Place{" +
                "name='" + name + '\'' +
                ", navigatorRating=" + navigatorRating +
                ", guideRating=" + guideRating +
                '}';
    }
}

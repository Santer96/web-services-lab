package com.lab9.converter;

public class AviConverter implements VideoConverter {

    @Override
    public void convert(String filePath) {
        System.out.println("Converting AVI video file " + filePath);
    }
}

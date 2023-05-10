package com.lab9.converter;

public class MovConverter implements VideoConverter {

    @Override
    public void convert(String filePath) {
        System.out.println("Converting MOV video file " + filePath);
    }
}

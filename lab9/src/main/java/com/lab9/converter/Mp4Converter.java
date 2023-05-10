package com.lab9.converter;

public class Mp4Converter implements VideoConverter {

    @Override
    public void convert(String filePath) {
        System.out.println("Converting MP4 video file " + filePath);
    }
}

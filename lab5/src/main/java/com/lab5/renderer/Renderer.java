package com.lab5.renderer;

public interface Renderer {

    Renderer addTitle(String title);
    Renderer addContent(String content);
    Renderer addImage(String image);
    Renderer addIdentifier(long identifier);
    void doRender();
}

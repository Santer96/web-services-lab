package com.lab5.renderer;

/**
 * Used builder pattern
 */
public interface Renderer {

    Renderer addTitle(String title);
    Renderer addContent(String content);
    Renderer addImage(String image);
    Renderer addIdentifier(long identifier);
    void doRender();
}

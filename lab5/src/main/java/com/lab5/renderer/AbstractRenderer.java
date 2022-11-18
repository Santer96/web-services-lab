package com.lab5.renderer;

public abstract class AbstractRenderer implements Renderer {

    protected String title;
    protected String content;
    protected String image;
    protected long identifier;

    public Renderer addTitle(String title) {
        this.title = title;
        return this;
    }

    public Renderer addContent(String content) {
        this.content = content;
        return this;
    }

    public Renderer addImage(String image) {
        this.image = image;
        return this;
    }

    public Renderer addIdentifier(long identifier) {
        this.identifier = identifier;
        return this;
    }

    public abstract void doRender();
}

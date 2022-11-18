package com.lab5.page;

import com.lab5.renderer.Renderer;

public class SimplePage implements Page {

    private Renderer renderer;
    private String title;
    private String content;

    public SimplePage(Renderer renderer) {
        this.renderer = renderer;
    }

    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void renderPage() {
        renderer.addTitle(title)
                .addContent(content)
                .doRender();
    }
}

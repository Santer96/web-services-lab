package com.lab5.renderer;

public class HtmlRenderer extends AbstractRenderer {

    public void doRender() {
        System.out.println("HTML RENDERED:");
        System.out.println(buildPage());
    }

    private String buildPage() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body>\n");
        if (title != null) {
            sb.append("<h1>").append(title).append("</h1>\n");
        }
        if (content != null) {
            sb.append("<div>").append(content).append("</div>\n");
        }
        if (image != null) {
            sb.append("<img src=\"").append(image).append("\" />\n");
        }
        if (identifier != 0L) {
            sb.append("<a href=\"").append(identifier).append("\">Buy</a>\n");
        }
        sb.append("</html></body>\n");

        return sb.toString();
    }
}

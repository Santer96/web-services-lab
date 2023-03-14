package com.lab5.renderer;

public class JsonRenderer extends AbstractRenderer {

    public void doRender() {
        System.out.println("JSON RENDERED:");
        System.out.println(buildPage());
    }

    private String buildPage() {
        StringBuilder sb = new StringBuilder();
        sb.append("page: {\n");
        if (title != null) {
            sb.append("\"Title\": \"").append(title).append("\"");
        }
        if (content != null) {
            sb.append(", \n\"Content\": \"").append(content).append("\"");
        }
        if (image != null) {
            sb.append(", \n\"image\": \"").append(image).append("\"");
        }
        if (identifier != 0L) {
            sb.append(", \n\"ID\": ").append(identifier);
        }
        sb.append("\n}\n");

        return sb.toString();
    }
}

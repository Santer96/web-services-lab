package com.lab5.page;

import com.lab5.entity.Product;
import com.lab5.renderer.Renderer;

public class ProductPage implements Page {

    private Renderer renderer;
    private Product product;

    public ProductPage(Renderer renderer) {
        this.renderer = renderer;
    }

    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void renderPage() {
        renderer.addTitle(product.getName())
                .addContent(product.getDescription())
                .addImage(product.getImageLink())
                .addIdentifier(product.getId())
                .doRender();
    }
}

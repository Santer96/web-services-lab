package com.lab5;

import com.lab5.entity.Product;
import com.lab5.page.ProductPage;
import com.lab5.page.SimplePage;
import com.lab5.renderer.HtmlRenderer;
import com.lab5.renderer.JsonRenderer;
import com.lab5.renderer.Renderer;
import com.lab5.renderer.XmlRenderer;

public class Demo {

    public static void main(String[] args) {

        // initialize renderers
        Renderer htmlRenderer = new HtmlRenderer();
        Renderer jsonRenderer = new JsonRenderer();
        Renderer xmlRenderer = new XmlRenderer();

        // initialize pages
        ProductPage productPage = new ProductPage(htmlRenderer);
        Product product = new Product(1L, "Snickers", "Sweet chockolate", "http://image-link");
        productPage.setProduct(product);

        SimplePage simplePage = new SimplePage(htmlRenderer);
        simplePage.setTitle("Some Title");
        simplePage.setContent("Some Content");

        //use html renderers
        simplePage.renderPage();
        productPage.renderPage();

        //use json renderers
        simplePage.setRenderer(jsonRenderer);
        productPage.setRenderer(jsonRenderer);
        simplePage.renderPage();
        productPage.renderPage();

        //use xml renderers
        simplePage.setRenderer(xmlRenderer);
        productPage.setRenderer(xmlRenderer);
        simplePage.renderPage();
        productPage.renderPage();


//        OUTPUT:
//
//        HTML RENDERED:
//        <html><body>
//        <h1>Some Title</h1>
//        <div>Some Content</div>
//        </html></body>
//
//        HTML RENDERED:
//        <html><body>
//        <h1>Snickers</h1>
//        <div>Sweet chockolate</div>
//        <img src="http://image-link" />
//        <a href="1">Buy</a>
//        </html></body>
//
//        JSON RENDERED:
//        page: {
//        "Title": "Some Title",
//        "Content": "Some Content"
//        }
//
//        JSON RENDERED:
//        page: {
//        "Title": "Snickers",
//        "Content": "Sweet chockolate",
//        "image": "http://image-link",
//        "ID": 1
//        }
//
//        XML RENDERED:
//        <page>
//        <title>Some Title</title>
//        <content>Some Content</content>
//        </page>
//
//        XML RENDERED:
//        <page>
//        <title>Snickers</title>
//        <content>Sweet chockolate</content>
//        <image>http://image-link</image>
//        <id>1</id>
//        </page>

    }
}

package com.lab5;

import com.lab5.entity.Order;
import com.lab5.entity.Product;
import com.lab5.entity.User;
import com.lab5.processor.OrderRequestProcessor;
import com.lab5.processor.ProductRequestProcessor;
import com.lab5.processor.UserRequestProcessor;
import com.lab5.rest.RestRequest;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product("Milk", 3, true);
        Product p2 = new Product("Meat", 10, true);
        User user = new User("user", "password", "email");
        Order order = new Order(user, Arrays.asList(p1, p2));

        //valid product
        RestRequest productRestRequest = new RestRequest(p1);
        ProductRequestProcessor productRequestProcessor = new ProductRequestProcessor();
        System.out.println(productRequestProcessor.processRequest(productRestRequest));
//        Updating product in DB...
//        Product successfully updated

        //invalid product
        RestRequest productRestRequest2 = new RestRequest(new Product("Cheese", -15, false));
        ProductRequestProcessor productRequestProcessor2 = new ProductRequestProcessor();
        System.out.println(productRequestProcessor2.processRequest(productRestRequest2));
//        Product validation failed. Send message to administrator...
//        Product fields are invalid!

        //user
        RestRequest userRestRequest = new RestRequest(user);
        UserRequestProcessor userRequestProcessor = new UserRequestProcessor();
        System.out.println(userRequestProcessor.processRequest(userRestRequest));
//        Remove email field from user entity...
//        Updating user in DB...
//        User successfully updated

        //order
        RestRequest orderRestRequest = new RestRequest(order);
        OrderRequestProcessor orderRequestProcessor = new OrderRequestProcessor();
        System.out.println(orderRequestProcessor.processRequest(orderRestRequest));
//        User successfully updated
//        Updating order in DB...
//        Order successfully updated: Order{user=User{name='user', password='password', email=''},
//              products=[Product{name='Milk', price=3, available=true}, Product{name='Meat', price=10, available=true}]}
    }
}

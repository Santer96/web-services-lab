package com.lab4.strategy;

public class PickUpDeliveryStrategy implements DeliveryStrategy {

    public void calculateDeliveryCost() {
        System.out.println("Calculating delivery cost for 'Pick Up'");
    }
}

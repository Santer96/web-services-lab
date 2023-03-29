package com.lab4.strategy;

public class ThirdPartyDeliveryStrategy implements DeliveryStrategy {

    public void calculateDeliveryCost() {
        System.out.println("Calculating delivery cost for 'Delivery by third party'");
    }
}

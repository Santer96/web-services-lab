package com.lab4.order;

import com.lab4.strategy.DeliveryStrategy;

public class OrderContext {

    private DeliveryStrategy deliveryStrategy;

    public OrderContext(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public void calculateCost() {
        deliveryStrategy.calculateDeliveryCost();
    }
}

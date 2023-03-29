package com.lab4;

import com.lab4.order.OrderContext;
import com.lab4.strategy.CompanyDeliveryStrategy;
import com.lab4.strategy.DeliveryStrategy;
import com.lab4.strategy.PickUpDeliveryStrategy;
import com.lab4.strategy.ThirdPartyDeliveryStrategy;

public class Main {

    public static void main(String[] args) {
        DeliveryStrategy companyDeliveryStrategy = new CompanyDeliveryStrategy();
        DeliveryStrategy thirdPartyDeliveryStrategy = new ThirdPartyDeliveryStrategy();
        DeliveryStrategy pickUpDeliveryStrategy = new PickUpDeliveryStrategy();

        OrderContext orderContext = new OrderContext(companyDeliveryStrategy);
        orderContext.calculateCost();
//        Calculating delivery cost for 'Delivery by company'

        orderContext.setDeliveryStrategy(thirdPartyDeliveryStrategy);
        orderContext.calculateCost();
//        Calculating delivery cost for 'Delivery by third party'

        orderContext.setDeliveryStrategy(pickUpDeliveryStrategy);
        orderContext.calculateCost();
//        Calculating delivery cost for 'Pick Up'
    }
}

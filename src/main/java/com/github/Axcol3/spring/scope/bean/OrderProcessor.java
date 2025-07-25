package com.github.Axcol3.spring.scope.bean;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

@Component
public class OrderProcessor {
    private final ObjectProvider<Waiter> waiterObjectProvider;

    private final HeadChef headChef;

    public OrderProcessor(HeadChef headChef, ObjectProvider<Waiter> waiterObjectProvider) {
        this.headChef = headChef;
        this.waiterObjectProvider = waiterObjectProvider;
    }

    public void processOrder(String order, int table) {
        Waiter waiter = waiterObjectProvider.getObject();
        waiter.takeOrder(order, table);
        headChef.makeOrder(waiter);
    }

}

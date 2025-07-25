package com.github.Axcol3.spring.di.bean;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private final Waiter waiter;
    public Customer(Waiter waiter) {
        this.waiter = waiter;
    }
    public void takeOrder(String order, int table) {
        System.out.println("Customer take order " + order);
        waiter.takeOrder(order, table);
    }
}

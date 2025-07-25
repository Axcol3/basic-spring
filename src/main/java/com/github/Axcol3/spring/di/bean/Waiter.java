package com.github.Axcol3.spring.di.bean;

import org.springframework.stereotype.Component;

@Component
public class Waiter  {

    private final Kitchen kitchen;

    public Waiter(Kitchen kitchen) {
        this.kitchen = kitchen;
    }


    public void takeOrder(String order, int table){
        System.out.println("Waiter take order " + order);
        kitchen.cook(order);
    }


}

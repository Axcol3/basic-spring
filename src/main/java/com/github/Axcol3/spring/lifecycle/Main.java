package com.github.Axcol3.spring.lifecycle;

import com.github.Axcol3.spring.lifecycle.bean.CoffeeShop;
import com.github.Axcol3.spring.lifecycle.config.LifeCycleConfiguration;
import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        CoffeeShop coffeeShop = context.getBean(CoffeeShop.class);
       // coffeeShop.makeCoffee();
//        coffeeShop.makeCoffee("Latte");
//        coffeeShop.makeCoffee("Latte");
        coffeeShop.makeCoffee("LAtte", "sugar");
        coffeeShop.makeCoffee("LAtte", "milk");
        context.close();

    }
}

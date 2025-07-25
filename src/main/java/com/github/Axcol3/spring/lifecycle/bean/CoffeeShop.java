package com.github.Axcol3.spring.lifecycle.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.HashMap;
import java.util.Map;

@Component
public class CoffeeShop {

    private final ObjectProvider<Coffee> coffeeProvider;
    private final Map<String, Ingredient> ingredients;

    public void makeCoffee(String type){
        Coffee coffee = coffeeProvider.getObject(type);
        System.out.println("Make Coffee" + coffee);
    }
    public CoffeeShop(ObjectProvider<Coffee> coffeeProvider, Map<String, Ingredient> ingredients) {
        this.coffeeProvider = coffeeProvider;
        this.ingredients = ingredients;
    }

    @PostConstruct
    public void openShop(){
        System.out.println("Shop is Open");
    }


    public void makeCoffee(){
        System.out.println("Make Coffee");
    }
//
    @PreDestroy
    public void closeShop(){
        System.out.println("Shop is Closed");
    }

    public void makeCoffee(String type, String ingredient){
        Coffee coffee = coffeeProvider.getObject(type);
        System.out.println("Make Coffee with ingredient : " + ingredients.get(ingredient) + ". Coffee: " + coffee);
    }
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Shop is Open");
//    }
//
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("Shop is Closed");
//    }
}

package com.github.Axcol3.spring.postprocess.bean;

import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;

@Component
public class Restaurant {
    private final LocalTime openTime;
    private final List<Food> menu;

    public Restaurant(List<Food> menu, LocalTime openTime) {
        this.menu = menu;
        this.openTime = openTime;
    }

    public void printInfo(){
        System.out.println("Open Time: " + openTime);
        System.out.println("Menu: " + menu);
    }
}

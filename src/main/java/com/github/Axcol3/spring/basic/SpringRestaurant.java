package com.github.Axcol3.spring.basic;

import com.github.Axcol3.spring.basic.config.RestaurantConfiguration;
import com.github.Axcol3.spring.basic.staff.Barista;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringRestaurant {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext manager = new AnnotationConfigApplicationContext(RestaurantConfiguration.class);
        Barista barista = manager.getBean("barista",Barista.class);
        barista.makeCoffee();
    }
}

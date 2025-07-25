package com.github.Axcol3.spring.props;

import com.github.Axcol3.spring.props.bean.Restaurant;
import com.github.Axcol3.spring.props.config.ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Restaurant restaurant = context.getBean(Restaurant.class);
        restaurant.printMenu();
        restaurant.printMainInfo();
    }

}

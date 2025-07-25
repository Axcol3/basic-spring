package com.github.Axcol3.spring.postprocess;


import com.github.Axcol3.spring.postprocess.bean.Restaurant;
import com.github.Axcol3.spring.postprocess.bean.Waiter;
import com.github.Axcol3.spring.postprocess.config.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Waiter waiter = context.getBean(Waiter.class);
        waiter.takeOrder();
        context.getBean(Restaurant.class).printInfo();


    }
}

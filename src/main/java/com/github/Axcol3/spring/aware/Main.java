package com.github.Axcol3.spring.aware;

import com.github.Axcol3.spring.aware.bean.Menu;
import com.github.Axcol3.spring.aware.config.ApplicationConfiguration;
import com.github.Axcol3.spring.aware.bean.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Waiter waiter =  context.getBean(Waiter.class);
        waiter.takeOrder("Salad");
        waiter.greetCustomer();
        Menu menu = context.getBean(Menu.class);
        menu.printMenu();

    }
}

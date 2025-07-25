package com.github.Axcol3.spring.di;

import com.github.Axcol3.spring.di.bean.Customer;
import com.github.Axcol3.spring.di.config.CafeConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CafeApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CafeConfiguration.class);
        Customer customer = context.getBean("customer", Customer.class);
        customer.takeOrder("Salad and Coffee", 2);
    }
}

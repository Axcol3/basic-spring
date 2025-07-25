package com.github.Axcol3.spring.scope;

import com.github.Axcol3.spring.scope.bean.HeadChef;
import com.github.Axcol3.spring.scope.bean.ObjectProviderExample;
import com.github.Axcol3.spring.scope.bean.OrderProcessor;
import com.github.Axcol3.spring.scope.bean.Waiter;
import com.github.Axcol3.spring.scope.config.RestaurantConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class RestaurantApplication {
    public static void main(String[] args) {
     ApplicationContext context = new AnnotationConfigApplicationContext(RestaurantConfig.class);
//     System.out.println(context.getBean(HeadChef.class) == context.getBean(HeadChef.class));
//        System.out.println(context.getBean(Waiter.class) == context.getBean(Waiter.class));
//        HeadChef headChef1 = context.getBean(HeadChef.class);
//        HeadChef headChef2 = context.getBean(HeadChef.class);
//        headChef1.setName("Alex");
//        System.out.println(headChef1.getName());
//        System.out.println(headChef2.getName());
//        Waiter waiter1 = context.getBean(Waiter.class);
//        Waiter waiter2 = context.getBean(Waiter.class);
//        waiter1.setOrder("Pizza");
//        System.out.println(waiter1);
//        System.out.println(waiter2);
//       ObjectProviderExample objectProvider = context.getBean(ObjectProviderExample.class);
//       objectProvider.getAndCompareHeadChef();
//       objectProvider.getAndCompareWaiter();

        OrderProcessor orderProcessor = context.getBean(OrderProcessor.class);
        orderProcessor.processOrder("Coffee", 2);

    }
}

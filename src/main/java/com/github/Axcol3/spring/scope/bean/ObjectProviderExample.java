package com.github.Axcol3.spring.scope.bean;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

@Component
public class ObjectProviderExample {
    private final ObjectProvider<Waiter> waiterObjectProvider;
    private final ObjectProvider<HeadChef> headChefObjectProvider;


    public ObjectProviderExample(ObjectProvider<Waiter> waiterObjectProvider, ObjectProvider<HeadChef> headChefObjectProvider) {
        this.waiterObjectProvider = waiterObjectProvider;
        this.headChefObjectProvider = headChefObjectProvider;
    }

    public void getAndCompareHeadChef() {
        HeadChef headChef = headChefObjectProvider.getObject();
        HeadChef headChef2 = headChefObjectProvider.getObject();
        System.out.println("HeadChef are the same: " + (headChef==headChef2));
    }

    public void getAndCompareWaiter(){
        Waiter waiter = waiterObjectProvider.getObject();
        Waiter waiter2 = waiterObjectProvider.getObject();
        System.out.println("Waiter are the same: " + (waiter==waiter2));
    }


}

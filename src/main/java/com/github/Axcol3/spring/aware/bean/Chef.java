package com.github.Axcol3.spring.aware.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;


public class Chef implements BeanNameAware {
    private String chefName;
    public void cook(String dish){
        System.out.println("Chef cooked" + dish + ". Name is " + chefName);
    }

    @Override
    public void setBeanName(String name) {
        chefName = name;
    }
}

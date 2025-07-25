package com.github.Axcol3.spring.postprocess.bean;

import org.springframework.stereotype.Component;

@Component
public class Waiter {
    public boolean onDuty;

    public void takeOrder() {
        if (onDuty) {
            System.out.println("Take Order");
        }else{
            System.out.println("Not Take Order");
        }


    }

    public void setOnDuty(boolean onDuty) {
        this.onDuty = onDuty;
    }

    public boolean isOnDuty() {
        return onDuty;
    }
}

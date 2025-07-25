package com.github.Axcol3.spring.postprocess.bean;

import com.github.Axcol3.spring.postprocess.annotation.Discount;

public class Food {

    private String type;
    private String dishName;
    @Discount(percnt = 30)
    private int discount;


    @Override
    public String toString() {
        return "Food{" +
                "discount=" + discount +
                ", type='" + type + '\'' +
                ", dishName='" + dishName + '\'' +
                '}';
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }



    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getType() {
        return type;
    }

    public Food(String dishName, String type) {
        this.dishName = dishName;
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }


}

package com.github.Axcol3.spring.lifecycle.bean;

public class Ingredient {
    private final String value;
    public Ingredient(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "value='" + value + '\'' +
                '}';
    }


}

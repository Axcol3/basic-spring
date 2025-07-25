package com.github.Axcol3.spring.lifecycle.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Coffee {
    private final String type;

    public Coffee(String type) {
        this.type = type;
    }


    @PostConstruct
    public void postConstruct(){
        System.out.println("Post Construct: make Coffee with type: " + type);
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Pre Destroy: make Coffee with type: " + type);
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                '}';
    }
}

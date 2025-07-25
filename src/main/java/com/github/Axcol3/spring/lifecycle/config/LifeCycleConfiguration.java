package com.github.Axcol3.spring.lifecycle.config;

import com.github.Axcol3.spring.lifecycle.bean.CoffeeShop;
import com.github.Axcol3.spring.lifecycle.bean.IngredientFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.github.Axcol3.spring.lifecycle")
public class LifeCycleConfiguration {

   //@Bean(initMethod = "openShop", destroyMethod = "closeShop")
//    public CoffeeShop coffeeShop() {
//        return new CoffeeShop();
//    }

    @Bean
    public IngredientFactoryBean sugar(){
        return new IngredientFactoryBean("sugar");
    }

    @Bean
    public IngredientFactoryBean milk(){
        return new IngredientFactoryBean("milk");
    }


}

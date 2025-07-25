package com.github.Axcol3.spring.di.config;

import com.github.Axcol3.spring.di.bean.Kitchen;
import com.github.Axcol3.spring.di.bean.Waiter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.github.Axcol3.spring.di")
public class CafeConfiguration {
    @Bean
    public Waiter waiter(Kitchen kitchen) {
        return new Waiter(kitchen);
    }

}

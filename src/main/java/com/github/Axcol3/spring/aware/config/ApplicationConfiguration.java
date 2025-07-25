package com.github.Axcol3.spring.aware.config;

import com.github.Axcol3.spring.aware.bean.Chef;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.github.Axcol3.spring.aware")
public class ApplicationConfiguration {

    @Bean
    public Chef resturantChef() {
        return new Chef();
    }
}

package com.example.springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanConfig {

    @Bean(initMethod = "init")
    public NewBean newBean (BeanService beanService){
        return new NewBean(beanService);
    }

}

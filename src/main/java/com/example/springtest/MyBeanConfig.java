package com.example.springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyBeanConfig {

    @Bean(initMethod = "myInit")
    public MyNewBean myNewBean(MyBeanService beanService){
        return new MyNewBean(beanService);
    }

}

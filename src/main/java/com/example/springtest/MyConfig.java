package com.example.springtest;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//public class MyConfig {
//
//    @Bean(initMethod = "preInit", destroyMethod = "cleanup")
//    public MyBean3 myBean3() {
//        return new MyBean3();
//    }
//
//    @Bean
//    public static BeanPostProcessor myBeanPostProcessor() {
//        return new MyBeanPostProcessor();
//    }
//}

@Configuration
public class MyConfig {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public MyBean3 myBean3() {
        return new MyBean3();
    }
}
package com.example.springtest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyBean3 {
//    public void preInit() {
//        System.out.println("Pre-initialization logic");
//    }
//
//    public void cleanup() {
//        System.out.println("Cleanup logic");
//    }


    public MyBean3() {
        System.out.println("Constructor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("PostConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("PreDestroy");
    }

    public void initMethod() {
        System.out.println("initMethod");
    }

    public void destroyMethod() {
        System.out.println("destroyMethod");
    }
}


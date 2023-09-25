package com.example.springtest;

import org.springframework.stereotype.Component;

@Component
public class MyBean2 {

    String name ;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

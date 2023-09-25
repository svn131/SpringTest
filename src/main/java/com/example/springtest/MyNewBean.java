package com.example.springtest;

import jakarta.annotation.PostConstruct;

public class MyNewBean {
    private final MyBeanService beanService;

    public MyNewBean(MyBeanService beanService) {
        System.out.println("Вход в конструктор");
        this.beanService = beanService;
        System.out.println("Выход из конструктора");
    }

    private void myInit(){
        System.out.println("Отработал MyInit метод");
    }


    @PostConstruct
    private void myPostConstruct(){
        System.out.println("Отработал MyPostConstruct метод");
    }

}

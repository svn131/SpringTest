package com.example.springtest;

import jakarta.annotation.PostConstruct;

public class NewBean {
    private final BeanService beanService;

    public NewBean(BeanService beanService) {
        System.out.println("Вход в конструктор");
        this.beanService = beanService;
        System.out.println("Выход из конструктора");
    }

    private void init(){
        System.out.println("Отработал init метод");
    }


    @PostConstruct
    private void postConstruct(){
        System.out.println("Отработал postConstruct метод");
    }

}

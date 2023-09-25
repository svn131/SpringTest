package com.example.springtest;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class GhiznenyeCiclyBean implements InitializingBean, DisposableBean {
    @PostConstruct
    public void postConstruct() {
        System.out.println("Код, который будет выполнен после создания бина и внедрения зависимостей");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Код, который будет выполнен после внедрения зависимостей и настройки свойств бина");

    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Код, который будет выполнен перед уничтожением бина");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Код, который будет выполнен перед уничтожением бина");

    }
}

//Создание (Instantiation): Создание экземпляра бина.
//Внедрение свойств и зависимостей (Population): Установка значений свойств и внедрение зависимостей.
//Предварительная инициализация (Initialization): Выполнение пользовательской логики и настройка бина перед использованием.
//Уничтожение (Destruction): Выполнение действий перед уничтожением бина.
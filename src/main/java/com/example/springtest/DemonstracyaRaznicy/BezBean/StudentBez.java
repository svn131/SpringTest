package com.example.springtest.DemonstracyaRaznicy.BezBean;

public class StudentBez {
    private String name;
    private int age;

    // Конструкторы, геттеры и сеттеры...


    public StudentBez(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


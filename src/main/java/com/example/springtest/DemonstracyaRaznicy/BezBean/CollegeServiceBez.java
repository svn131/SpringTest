package com.example.springtest.DemonstracyaRaznicy.BezBean;

import java.util.ArrayList;
import java.util.List;

public class CollegeServiceBez { // Обслуживающий класс ?
    private List<StudentBez> students = new ArrayList<>();

    public void addStudent(StudentBez student) {
        students.add(student);
    }

    public void removeStudent(StudentBez student) {
        students.remove(student);
    }

    // Другие операции с студентами...
}


//    Student student1 = new Student("John", 20);
//    CollegeService collegeService = new CollegeService();
//collegeService.addStudent(student1);
//        collegeService.removeStudent(student1);


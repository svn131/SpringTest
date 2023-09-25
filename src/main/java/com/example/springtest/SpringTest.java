package com.example.springtest;

import com.example.springtest.DemonstracyaRaznicy.SBean.AppConfig;
import com.example.springtest.DemonstracyaRaznicy.SBean.CollegeService;
import com.example.springtest.DemonstracyaRaznicy.SBean.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { SpringApplicationAdminJmxAutoConfiguration.class })
public class SpringTest {

    public static void main(String[] args) {
//        SpringApplication.run(SpringTest.class, args);
//
//
//        // Создаем студента
//        Student student1 = new Student();
//        student1.setName("John");
//        student1.setAge(20);
//
//        // Инициализируем контекст приложения с помощью AppConfig
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        // Получаем экземпляр CollegeService из контекста
//        CollegeService collegeService = context.getBean(CollegeService.class);
//
//        // Вызываем методы CollegeService
//        collegeService.addStudent(student1); // Выведет "Logging before addStudent"
//        collegeService.removeStudent(student1); // Выведет "Logging before removeStudent"
////////////////////////////////////////////////////////////////////////////////////////////////

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        MyBean3 myBean3 = context.getBean(MyBean3.class);

        // Вызывайте методы, чтобы увидеть каждый этап жизненного цикла
        // В конце закройте контекст
        context.close();



    }



}



//        ConfigurableApplicationContext context = SpringApplication.run(SpringTest.class, args);
//
//        MyBean2 myBean2 = context.getBean(MyBean2.class);
//
//        myBean2.setName("Jonnnyyyyy");
//
//        System.out.println(myBean2.getName());
//
//        context.close();

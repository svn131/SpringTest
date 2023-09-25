package com.example.springtest.DemonstracyaRaznicy.SBean;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLOgingBeanClass {
    @Before("execution(* com.example.springtest.DemonstracyaRaznicy.SBean.CollegeService.*(..))")   // . Аннотация @Before указывает, что метод myLogingMetod будет выполнен перед каждым методом, соответствующим паттерну execution(* com.example.springtest.DemonstracyaRaznicy.SBean.CollegeService.*(..)).
    public void myLogingMetod(JoinPoint joinPoint) {
        System.out.println("Логирую действие " + joinPoint.getSignature().getName());
    }
}


// точка сеза это видимо то места где мы вклинились и отаноили метод для своих движух

//@Aspect - Эта аннотация указывает Spring, что данный класс является аспектом в аспектно-ориентированном программировании (АОП).
// Аспект включает в себя советы (advice), которые определяют логику, выполняемую до или после выполнения методов, и точки среза
// (pointcuts), которые определяют, к каким методам должны применяться эти советы.

//@Component - Эта аннотация говорит Spring, что данный класс является компонентом, который должен быть управляемым фреймворком.
// С помощью этой аннотации мы регистрируем класс в контексте Spring и позволяем ему создавать экземпляры и управлять ими, например,
// для внедрения зависимостей.
//
//Вместе эти аннотации позволяют Spring распознать класс MyLOgingBeanClass как аспект и управляемый компонент. Таким образом,
// Spring будет знать о существовании этого аспекта и его советов, и автоматически применять его поведение (логирование) к
// соответствующим методам класса CollegeService, без необходимости явного вызова аспекта или изменения кода CollegeService.

//@Before: Аннотация указывает, что метод myLogingMetod будет выполнен перед каждым методом, соответствующим указанному паттерну.
//execution(* com.example.springtest.DemonstracyaRaznicy.SBean.CollegeService.*(..)): Это паттерн, описывающий, какие методы
// будут перехватываться. Здесь указывается, что все методы в классе CollegeService
// (из пакета com.example.springtest.DemonstracyaRaznicy.SBean) с любыми параметрами будут перехвачены.


//public void myLogingMetod(JoinPoint joinPoint): Это метод, который будет выполнен перед перехваченными методами. Он принимает
// объект JoinPoint, который предоставляет информацию о текущем выполнении точки среза (метода).
//System.out.println("Логирую действие " + joinPoint.getSignature().getName()): В данном случае, при вызове перехваченных методов,
// будет выводиться сообщение в консоль, содержащее имя вызываемого метода.
//Таким образом, путем объявления аспекта с соответствующим паттерном и методом, вы добавляете логирование перед каждым методом,
// который соответствует паттерну, без необходимости изменения кода самого класса CollegeService.
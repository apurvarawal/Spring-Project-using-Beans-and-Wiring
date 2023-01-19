package com.example.main;

import com.example.Config.ProjectConfig;
import com.example.beans.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3_Lazy {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before creating bean");
        Person person = context.getBean(Person.class); //Since we are using @Lazy annotation, bean is created when it is called
        //If we use default ,i.e., not using @Lazy annotation, then the bean is created when the program is run.
        System.out.println("After creating bean");
    }
}

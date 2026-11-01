package com.example;

import com.example.config.ProjectConfig;
import  com.example.beans.Person;
import  com.example.beans.Parrot;

import  org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        var context =
                new AnnotationConfigApplicationContext
                        (ProjectConfig.class);

        Person person = context.getBean(Person.class);

        Parrot parrot = context.getBean(Parrot.class);

        System.out.println("Person's name: " + person.getName());

        System.out.println("Parrot's name: " + parrot.getName());

        System.out.println("Person's parrot: " + person.getParrot());

    }
}

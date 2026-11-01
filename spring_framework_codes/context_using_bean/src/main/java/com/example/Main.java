package com.example;

import com.example.beans.Parrot;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;
//import  org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
       // Parrot p = context.getBean(Parrot.class);

       // System.out.println(p);
       // System.out.println(p.getName());
        Parrot x = new Parrot();
        x.setName("Kiki");

        Supplier<Parrot> parrotSupplier = () -> x;

        context.registerBean("parrot1", Parrot.class, parrotSupplier, bc -> bc.setPrimary(true));

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
    }
}

package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ProjectConfig;

public class Main {

    public static void main(String args[]) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /*
         * Parrot p = context.getBean("parrot", Parrot.class);
         * System.out.println(p.getName());
         * 
         * String s = context.getBean(String.class); System.out.println(s);
         * 
         * Integer n = context.getBean(Integer.class); System.out.println(n);
         * 
         * 
         * Parrot p = context.getBean("parrot2", Parrot.class);
         * System.out.println(p.getName());
         */

        Parrot p = context.getBean(Parrot.class);

        System.out.println(p);
        System.out.println(p.getName());
    }
}

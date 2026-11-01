package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ProjectConfig;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println(p);
        System.out.println(p.getName());
    }
}

package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class AppConfig {
    @Bean
    String greeting() {
        return "Hello! My first Spring application is running!";
    }
}

public class Main {
    public static void main(String[] args) {
        try (var context =
                new AnnotationConfigApplicationContext(AppConfig.class)) {
            System.out.println(context.getBean("greeting", String.class));
        }
    }
}

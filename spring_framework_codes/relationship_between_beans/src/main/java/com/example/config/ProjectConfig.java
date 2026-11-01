package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.beans.Parrot;
import com.example.beans.Person;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {

    /* @Bean
    public  Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean // project three wiring though parameters
    public  Person person(Parrot parrot) {
        Person p = new Person();
        p.setName("Ella");

        // project number 2, linking the person bean and the parrot bean via composition
        p.setParrot(parrot); //3. using parameter value
        return p;
    }*/
}

package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// project 3. using stereotype annotation along side autowiring
@Component
public class Person {

    private String name = "Ella";

    //2. through field injection @Autowired
    private Parrot parrot;

    //@Autowired, 2. using constructor injection
    // public  Person(Parrot parrot) {
    //   this.parrot = parrot;
    // }

    public String getName() {
        return name;
    }

    // setters and getters for name
    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    // setters and getters for parrot
    // 3. using setters injection
    @Autowired
    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}

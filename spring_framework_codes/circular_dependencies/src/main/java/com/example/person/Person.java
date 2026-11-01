package com.example.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import  com.example.parrot.Parrot;

@Component
public class Person {
    private  Parrot parrot;
    private String name;

    @Autowired
    public  Person()  {
    }

    public  void setName(String name) {this.name = name;}

    public  void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}

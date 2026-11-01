package com.example.parrot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import  com.example.person.Person;

@Component
public class Parrot {
    private  String name = "Koko";

    private final Person person;

    @Autowired
    public  Parrot(Person person) {

        this.person = person;
    }

    public void setName(String name) {this.name = name;}
}

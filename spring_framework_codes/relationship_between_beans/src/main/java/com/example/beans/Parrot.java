package com.example.beans;

import org.springframework.stereotype.Component;

// project 3. using autowiring and stereotype annotations
@Component
public class Parrot {

    private  String name = "Koko";

    public Parrot() {
        System.out.println("Parrot created");
    }

    // setters and getters
    public  void setName(String name) {
        this.name = name;
    }

    public  String getName() {
        return name;
    }

    // toString method to print the string representation of the object
    @Override
    public  String toString() {
        return "Parrot : " + getName();
    }
}

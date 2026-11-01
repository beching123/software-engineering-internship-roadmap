package com.example.demo;

import org.springframework.stereotype.Component;

@Component 
public class Parrot {

    private String name;

    // Omitted getters and setters
    public void setName(String name) {

        this.name = name;
    }

    // getting name
    public String getName() {

        return name;
    }
}
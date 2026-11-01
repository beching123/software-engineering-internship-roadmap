package com.example.demo;

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
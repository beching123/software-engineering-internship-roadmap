package com.example.beans;

//@Component
public class Parrot {
    private String name;

    /* @PostConstruct
     public  void init() {
         this.name = "Kiki";
     }*/
    // getters and setters
    public  String getName() {
        return name;
    }

    public  void setName(String name) {

        this.name = name;
    }
}

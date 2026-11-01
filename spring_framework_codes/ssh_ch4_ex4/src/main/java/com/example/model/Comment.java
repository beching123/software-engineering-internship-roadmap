package com.example.model;

public class Comment {

    private String author;
    private String text;

    // setters and getters
    public  void setAuthor(String author) {
        this.author = author;
    }

    public  void setText(String text) {
        this.text = text;
    }

    public  String getAuthor() {return author;}

    public String getText() {
        return text;
    }
}

package com.tmo.books;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {

    @JsonProperty
    private String title;
    @JsonProperty
    private String author;
    @JsonProperty
    private Integer year;

    public Book() {
    }

    public Book(String title, String author, Integer year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Book(Book book) {
        this.title = book.title;
        this.author = book.author;
        this.year = book.year;
    }

    public void printBookElements(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(year);
    }

    public String getTitle(){
        return title;
    }
}

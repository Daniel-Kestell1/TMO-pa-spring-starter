package com.tmo.books;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {

    @JsonProperty
    private String title;
    @JsonProperty
    private String author;
    @JsonProperty
    private Integer yearPublished;

    public Book() {
    }

    public Book(String title, String author, Integer yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public Book(Book book) {
        this.title = book.title;
        this.author = book.author;
        this.yearPublished = book.yearPublished;
    }

    public void printBookElements(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(yearPublished);
    }

    public String getTitle(){
        return title;
    }
}

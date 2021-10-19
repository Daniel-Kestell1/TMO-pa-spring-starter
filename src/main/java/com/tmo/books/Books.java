package com.tmo.books;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Books {

    @JsonProperty
    List<LibraryBook> books;


    public Books() {
    }

    public Books(List<LibraryBook> books) {
        this.books = books;
    }

    public List<LibraryBook> getBooks() {
        return books;
    }

    public void setBooks(List<LibraryBook> books) {
        this.books = books;
    }
}

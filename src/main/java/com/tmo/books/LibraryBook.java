package com.tmo.books;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LibraryBook extends Book{


    @JsonProperty
    private Integer id;

    public LibraryBook(){

    }

    public LibraryBook(Integer id, Book book) {
        super(book);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


}

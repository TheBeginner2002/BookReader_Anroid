package com.example.bookreader.model;

import java.io.Serializable;

public class BookModel implements Serializable {

    private String bookName;
    private String author;
    private int bookImage;


    public BookModel(String bookName, String author, int bookImage) {
        this.bookName = bookName;
        this.author = author;
        this.bookImage = bookImage;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookImage(int bookImage) {
        this.bookImage = bookImage;
    }

    public int getBookImage() {
        return bookImage;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }
}

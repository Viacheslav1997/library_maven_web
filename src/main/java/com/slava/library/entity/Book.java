package com.slava.library.entity;


import javax.persistence.*;

@Entity
@Table(name = "library")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "book")
    private String book;

    @Column(name = "author")
    private String author;

    @Column(name = "year")
    private int year;

    @Column(name = "quantity")
    private int quantity;

    public Book() {
    }

    public Book(int id, String book, String author, int year, int quantity) {
        this.id = id;
        this.book = book;
        this.author = author;
        this.year = year;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

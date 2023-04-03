package com.myapps.librarymanagement.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "author_name")
    private String authorName;

    @Column(name = "rented_date")
    @Temporal(TemporalType.DATE)
    private Date rentedDate;

    @Column(name = "due_date")
    @Temporal(TemporalType.DATE)
    private Date dueDate;

    @Column(name = "late_fee", precision = 5, scale = 2)
    private double lateFee;

    public Book(){

    }

    public Book(String bookName, String authorName, Date rentedDate, Date dueDate, double lateFee) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.rentedDate = rentedDate;
        this.dueDate = dueDate;
        this.lateFee = lateFee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Date getRentedDate() {
        return rentedDate;
    }

    public void setRentedDate(Date rentedDate) {
        this.rentedDate = rentedDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public double getLateFee() {
        return lateFee;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", rentedDate=" + rentedDate +
                ", dueDate=" + dueDate +
                ", lateFee=" + lateFee +
                '}';
    }
}

package library;

import java.util.*;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;

public class Book {

    private String booktype;
    private String bookname;
    private String author;
    private Integer quantity;
    private String genre;
    private String checkout;
    private String borrower;
    private String bookClass;

    // Our constructor with all properties given
    public Book(String booktype, String bookname, String author, int quantity, String genre, String checkout,
            String borrower, String bookClass) {
        this.booktype = booktype;
        this.bookname = bookname;
        this.author = author;
        this.quantity = quantity;
        this.genre = genre;
        this.checkout = checkout;
        this.borrower = borrower;
        this.bookClass = bookClass;
    }

    // Getters
    public String getbooktype() {
        return booktype;
    }

    public String getbookname() {
        return bookname;
    }

    public String getauthor() {
        return author;
    }

    public Integer getquantity() {
        return quantity;
    }

    public String getgenre() {
        return genre;
    }

    public String getcheckout() {
        return checkout;
    }

    public String getborrower() {
        return borrower;
    }

    public String getbookClass() {
        return bookClass;
    }

    // Setters
    public void setbooktype(String booktype) {
        this.booktype = booktype;
    }

    public void setbookname(String bookname) {
        this.bookname = bookname;
    }

    public void setauthor(String author) {
        this.author = author;
    }

    public void setquantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setgenre(String genre) {
        this.genre = genre;
    }

    public void setcheckout(String checkout) {
        this.checkout = checkout;
    }

    public void setborrower(String borrower) {
        this.borrower = borrower;
    }

    public void setBookClass(String bookClass) {
        this.bookClass = bookClass;
    }

    @Override
    public String toString() {
        return this.getbooktype() + " " + this.getbookname() + " " + this.getauthor() + " " + this.getquantity() + " "
                + this.getgenre() + " " + this.getcheckout() + " " + this.getborrower() + " " + this.getbookClass();
    }
}
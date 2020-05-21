package library;

import java.util.*;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;

public class Periodical {

    private String Periodicaltype;
    private String Periodicalname;
    private String author;
    private Integer quantity;
    private String genre;
    private String PeriodicalClass;

    // Our constructor with all properties given
    public Periodical(String Periodicaltype, String Periodicalname, String author, int quantity, String genre,
            String PeriodicalClass) {
        this.Periodicaltype = Periodicaltype;
        this.Periodicalname = Periodicalname;
        this.author = author;
        this.quantity = quantity;
        this.genre = genre;
        this.PeriodicalClass = PeriodicalClass;
    }

    // Getters
    public String getPeriodicaltype() {
        return Periodicaltype;
    }

    public String getPeriodicalname() {
        return Periodicalname;
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

    public String getPeriodicalClass() {
        return PeriodicalClass;
    }

    // Setters
    public void setPeriodicaltype(String Periodicaltype) {
        this.Periodicaltype = Periodicaltype;
    }

    public void setPeriodicalname(String Periodicalname) {
        this.Periodicalname = Periodicalname;
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

    public void setPeriodicalClass(String PeriodicalClass) {
        this.PeriodicalClass = PeriodicalClass;
    }

    @Override
    public String toString() {
        return this.getPeriodicaltype() + " " + this.getPeriodicalname() + " " + this.getauthor() + " "
                + this.getquantity() + " " + this.getgenre() + " " + this.getPeriodicalClass();
    }
}
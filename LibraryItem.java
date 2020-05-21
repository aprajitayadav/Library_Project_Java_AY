package library;

import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class LibraryItem {
    public static void main(String[] args) {
        System.out.println("Welcome to Aprajita's Charlotte Library!");
        Book nbook = new Book(null, null, null, 0, null, null, null, null);
        Periodical nperiod = new Periodical(null, null, null, 0, null, null);
        List<Book> booktypearray = new ArrayList<>();
        List<Periodical> periodicaltypearray = new ArrayList<>();

        nbook = new Book("Book", "Java", "Oracle", 2, "Software", "N", "", "Reference");
        booktypearray.add(nbook);
        nbook = new Book("Book", "Python", "Sun", 3, "Software", "N", "", "General");
        booktypearray.add(nbook);
        System.out.println("\n" + "Available list of books in the library:" + "\n");
        for (int i = 0; i < booktypearray.size(); i++) {
            System.out.println(booktypearray.get(i).toString());
        }

        nperiod = new Periodical("Periodical", "Fashion", "Vogue", 6, "Entertainment", "Magazine");
        periodicaltypearray.add(nperiod);
        nperiod = new Periodical("Periodical", "Charlotte Times", "Charlotte Observer", 20, "Media", "Newspaper");
        periodicaltypearray.add(nperiod);
        System.out.println("\n" + "Available list of periodicals in the library:" + "\n");
        for (int i = 0; i < periodicaltypearray.size(); i++) {
            System.out.println(periodicaltypearray.get(i).toString());
        }
    }
}
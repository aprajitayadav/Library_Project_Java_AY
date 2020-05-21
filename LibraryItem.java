package library;

import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class LibraryItem {
    public static void main(String[] args) {

        // Welcome banner message.
        System.out.println("Welcome to Aprajita's Charlotte Library!");

        // Initializing the contructor classes.
        GeneralBook gbook = new GeneralBook(null, null, null, 0, null, null, null, null, 0, 0, null);
        ReferenceBook rbook = new ReferenceBook(null, null, null, 0, null, null, null, null);
        Magazine maperiod = new Magazine(null, null, null, 0, null, null);
        Newspaper neperiod = new Newspaper(null, null, null, 0, null, null);

        // Initializing arrarys
        List<GeneralBook> generalBookarray = new ArrayList<>();
        List<ReferenceBook> referenceBookarray = new ArrayList<>();
        List<Magazine> magazinetypearray = new ArrayList<>();
        List<Newspaper> newspapertypearray = new ArrayList<>();

        // General Book class extending and using Book class with addditional fields.
        gbook = new GeneralBook("Book", "C++", "Microsoft", 32, "Software", "N", "", "General", 16, 32, "Raleigh");
        generalBookarray.add(gbook);
        gbook = new GeneralBook("Book", "Scripting", "Linux", 21, "Hardware", "N", "", "General", 11, 21, "Charlotte");
        generalBookarray.add(gbook);

        // Reference Book class extending and using Book class.
        rbook = new ReferenceBook("Book", "Java", "Oracle", 12, "Software", "N", "", "Reference");
        referenceBookarray.add(rbook);
        rbook = new ReferenceBook("Book", "Python", "Data", 27, "Data Science", "N", "", "Reference");
        referenceBookarray.add(rbook);

        // Printing the array contents.
        System.out.println("\n" + "Available list of General Books in the library:" + "\n");
        for (int i = 0; i < generalBookarray.size(); i++) {
            System.out.println(generalBookarray.get(i).toString());
        }
        System.out.println("\n" + "Available list of Reference Books in the library:" + "\n");
        for (int i = 0; i < referenceBookarray.size(); i++) {
            System.out.println(referenceBookarray.get(i).toString());
        }

        // Periodical Book class.
        maperiod = new Magazine("Periodical", "Fashion", "Vogue", 6, "Entertainment", "Magazine");
        magazinetypearray.add(maperiod);
        maperiod = new Magazine("Periodical", "Forbes", "WallStreet Journal", 22, "Finance", "Magazine");
        magazinetypearray.add(maperiod);

        neperiod = new Newspaper("Periodical", "Washington Daily", "Washington Post", 40, "Media", "Newspaper");
        newspapertypearray.add(neperiod);
        neperiod = new Newspaper("Periodical", "Charlotte Times", "Charlotte Observer", 20, "Media", "Newspaper");
        newspapertypearray.add(neperiod);

        // Printing the array contents.
        System.out.println("\n" + "Available list of Magazines in the library:" + "\n");
        for (int i = 0; i < magazinetypearray.size(); i++) {
            System.out.println(magazinetypearray.get(i).toString());
        }
        System.out.println("\n" + "Available list of Newspapers in the library:" + "\n");
        for (int i = 0; i < newspapertypearray.size(); i++) {
            System.out.println(newspapertypearray.get(i).toString());
        }
    }
}
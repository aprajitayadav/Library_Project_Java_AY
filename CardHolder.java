package library;

import java.util.*;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.*; // for DateFormat
import java.sql.Date;

public class CardHolder {
    private String chid;
    private String chname;
    private String chbookname;
    private String chauthorname;
    private GregorianCalendar chchkoutdt;
    private GregorianCalendar chduedate;
    private Integer chdaytodue;
    private double chfine;

    // Our constructor with all base properties given.
    public CardHolder(String chid, String chname, String chbookname, String chauthorname, GregorianCalendar chcktoutdt,
            GregorianCalendar chduedate, Integer chdaytodue, Double chfine) {
        // System.out.println(
        // "hello" + chid + chname + chbookname + chauthorname + chcktoutdt + chduedate
        // + chdaytodue + chfine);
        this.chid = chid;
        this.chname = chname;
        this.chbookname = chbookname;
        this.chauthorname = chauthorname;
        this.chchkoutdt = chcktoutdt;
        this.chduedate = chduedate;
        this.chdaytodue = chdaytodue;
        this.chfine = chfine;
    }

    public CardHolder(String cardid, String cardname, String cardbook, int i, Object object, Object object2, int j,
            int k) {
    }

    public String getTitle() {
        return chbookname;
    }

    public String getAuthor() {
        return chauthorname;
    }

    public String getBorrower() {
        return chname;
    }

    public GregorianCalendar getDueDate() {
        return chduedate;
    }

    public void checkout(String n, GregorianCalendar due) {
        chname = n;
        chduedate = (GregorianCalendar) (due.clone());
    }

    public void checkin() {
        chname = null;
        chduedate = null;
    }
}
package library;

import java.util.ArrayList;
import java.util.List;

public class OverDueList<E extends Book> {
    private E overDueItem;
    List<Book> overDueBook = new ArrayList<>();
    List<Periodical> overDuePeriodicals = new ArrayList<>();

    public void overDueList(E overDueItem) {
        this.overDueItem = overDueItem;
    }

    public E getOverDueItem() {
        return overDueItem;
    }

    public void setOverDueItem(E overDueItem) {
        this.overDueItem = overDueItem;
    }

}
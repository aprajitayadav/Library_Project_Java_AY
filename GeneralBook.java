package library;

public class GeneralBook extends Book {
    private Integer edition, aisle;
    private String location;

    public GeneralBook(String booktype, String bookname, String author, int quantity, String genre, String checkout,
            String borrower, String bookClass, Integer edition, Integer aisle, String location) {
        super(booktype, bookname, author, quantity, genre, checkout, borrower, bookClass);
        this.edition = edition;
        this.aisle = aisle;
        this.location = location;
    }

    // Addtional Getters methods for new fields.
    public int getedition() {
        return this.edition;
    }

    public int getaisle() {
        return this.aisle;
    }

    public String getlocation() {
        return this.location;
    }

    // Addtional Setters methods for new fields.
    public void setedition(int edition) {
        this.edition = edition;
    }

    public void setaisle(int aisle) {
        this.aisle = aisle;
    }

    public void setlocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return this.getbooktype() + " " + this.getbookname() + " " + this.getauthor() + " " + this.getquantity() + " "
                + this.getgenre() + " " + this.getcheckout() + " " + this.getborrower() + " " + this.getbookClass()
                + " " + this.getedition() + " " + this.getaisle() + " " + this.getlocation();
    }
}
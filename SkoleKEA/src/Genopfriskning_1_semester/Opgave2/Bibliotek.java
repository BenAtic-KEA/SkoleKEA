package Genopfriskning_1_semester.Opgave2;

import java.util.ArrayList;

public class Bibliotek {

    private String name;
    private ArrayList<Bog> books;

    Bibliotek(String shelfName){
        this.name = shelfName;
        this.books = new ArrayList<>();
    }

    public void addNewBook(int ISBN, String titel, int udgivelsesaar){
        this.books.add(new Bog(ISBN,titel,udgivelsesaar));
    }

    public boolean findBook(int ISBN){
        for (Bog book : books) {
            if (ISBN == book.getISBN()) {
                return true;
            }
        }
        return false;
    }
}

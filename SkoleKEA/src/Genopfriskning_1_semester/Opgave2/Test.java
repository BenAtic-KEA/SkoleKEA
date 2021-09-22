package Genopfriskning_1_semester.Opgave2;

public class Test {

    public static void main(String[] args) {

        Bibliotek lokalBiblioteket = new Bibliotek("Krimi");

        lokalBiblioteket.addNewBook(21212121,"Guns and Things",2020);
        lokalBiblioteket.addNewBook(23451122,"Hello Man",2010);
        lokalBiblioteket.addNewBook(23652322,"Goodbye Man",2013);


        System.out.println(lokalBiblioteket.findBook(234513422));
    }
}

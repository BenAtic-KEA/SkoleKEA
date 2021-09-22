package Genopfriskning_1_semester.Opgave2;

public class Bog {

    private int ISBN;
    private String titel;
    private int udgivelsesaar;

    Bog(int ISBN, String titel, int udgivelsesaar){

        this.ISBN = ISBN;
        this.titel = titel;
        this.udgivelsesaar = udgivelsesaar;
    }

    public int getISBN(){
        return ISBN;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public String getTitel(){
        return titel;
    }
    public void setTitel(String titel){
        this.titel = titel;
    }

    public int getUdgivelsesaar(){
        return udgivelsesaar;
    }
    
    public void setUdgivelsesaar(int udgivelsesaar){
        this.udgivelsesaar = udgivelsesaar;
        
    }

    @Override
    public String toString(){
        return ISBN + "\n" + titel + "\n" + udgivelsesaar;
    }

}

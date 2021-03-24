package InheritanceZoo;

public class Kangaroo extends Animal {


    public Kangaroo(String name, int nrOfLegs, Boolean isMammal){

        super(name,nrOfLegs,isMammal);

    }

    @Override
    public void makeSound(){

        System.out.println("RooRoo!");
    }
}

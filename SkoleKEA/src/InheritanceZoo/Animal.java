package InheritanceZoo;

public abstract class Animal {

    private String name;
    private int nrOfLegs;
    private Boolean isMammal;

    public Animal(String name, int nrOfLegs, Boolean isMammal){

        this.name = name;
        this.nrOfLegs = nrOfLegs;
        this.isMammal = isMammal;

    }

    public abstract void makeSound();

}

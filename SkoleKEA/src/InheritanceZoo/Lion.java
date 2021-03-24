package InheritanceZoo;

public class Lion extends Animal  {

    public Lion(String name, int nrOfLegs, Boolean isMammal){

        super(name,nrOfLegs,isMammal);

    }

    @Override
    public void makeSound(){

        System.out.println("MEOW!");
    }
}

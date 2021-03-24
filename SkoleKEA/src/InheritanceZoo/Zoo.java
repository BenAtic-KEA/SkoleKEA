package InheritanceZoo;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {

        Lion lion1 = new Lion("Simba",4,true);
        Kangaroo kangaroo1 = new Kangaroo("Fred",2,true);

        ArrayList<Animal> zooAnimals = new ArrayList<>();

        zooAnimals.add(lion1);
        zooAnimals.add(kangaroo1);

        for (Animal zooAnimal : zooAnimals) {

            zooAnimal.makeSound();

        }
    }
}

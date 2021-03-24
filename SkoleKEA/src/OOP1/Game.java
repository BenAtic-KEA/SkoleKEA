package OOP1;

public class Game {
    public static void main(String[] args) {


        // Cat

        Cat firstCat = new Cat("Fiddo",5,10,4);
        Cat secondCat = new Cat("Alfred",2,1,8);

        System.out.println(firstCat.greet());
        System.out.println();
        System.out.println(secondCat.greet());
        System.out.println();

        //OOP1.Person

        Person firstPerson = new Person("Simon","Male",27,1.90);
        Person secondPerson = new Person("Ygrit","Female",12,2.80);

        secondPerson.name = "jarl";
        System.out.println(firstPerson.greet());
        System.out.println(firstPerson.name);
        System.out.println();
        System.out.println(secondPerson.greet());
        System.out.println(secondPerson.name);

    }

}

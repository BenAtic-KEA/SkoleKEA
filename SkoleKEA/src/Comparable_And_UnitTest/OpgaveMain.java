package Comparable_And_UnitTest;

import java.util.ArrayList;
import java.util.Collections;

public class OpgaveMain {

    public static void main(String[] args) {
        //Person
        Person pers1 = new Person("Lars",1.8,40);
        Person pers2 = new Person("Michael",1.75,30);
        Person pers3 = new Person("Sofie",1.65,30);
        Person pers4 = new Person("Louise",1.70,20);

        ArrayList<Person> personList = new ArrayList<>();

        personList.add(pers1);
        personList.add(pers2);
        personList.add(pers3);
        personList.add(pers4);

        System.out.println(personList);

        Collections.sort(personList);

        System.out.println(personList);
    }


}

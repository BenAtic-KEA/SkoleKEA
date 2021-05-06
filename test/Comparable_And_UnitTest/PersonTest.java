package Comparable_And_UnitTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void compareTo() {

        Person testPers1 = new Person("William",1.80,25);
        Person testPers2 = new Person("Simon",1.85,25);
        Person testPers3 = new Person("Mark",1.80,25);
        Person testPers4 = new Person("Jarl",1.80,26);

        //pers. 1 er lavere værdi end pers 2 pga. "Height".
        assertEquals(testPers1.compareTo(testPers2),-1);
        assertEquals(testPers2.compareTo(testPers1),1);
        //pers. 1 er samme værdi som pers 3.
        assertEquals(testPers1.compareTo(testPers3),0);
        assertEquals(testPers1.compareTo(testPers1), 0);
        //pers 1 er lavere værdi end pers 4 grunde alder.
        assertEquals(testPers1.compareTo(testPers4),-1);
        assertEquals(testPers4.compareTo(testPers1),1);

    }
}
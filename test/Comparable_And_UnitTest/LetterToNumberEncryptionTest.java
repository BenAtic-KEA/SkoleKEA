package Comparable_And_UnitTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class LetterToNumberEncryptionTest {

    @Test
    public void fromStringToNumber() {

        LetterToNumberEncryption cypherTest = new LetterToNumberEncryption();

        String expected1 = "11-14-1-18-19-4-17";
        String expected2 = "0";
        String expected3 = "25";
        String expected4 = "";

        String code1 = cypherTest.fromStringToNumber("lobster");
        String code2 = cypherTest.fromStringToNumber("a");
        String code3 = cypherTest.fromStringToNumber("z");
        String code4 = cypherTest.fromStringToNumber("");

        // passer overens med expected1
        assertEquals(expected1,code1);
        //a = 0
        assertEquals(expected2,code2);
        //z = 25 (fandt ud af jeg havde glemt w)
        assertEquals(expected3,code3);
        //kontrollere om en tom String kan læses, (fandt ud af min substring i return fik den outOfBounds, tilføjede if statement)
        assertEquals(expected4,code4);

    }
}
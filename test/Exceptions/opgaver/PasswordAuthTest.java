package Exceptions.opgaver;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordAuthTest {

    @Test
    void isValidPassword() {
        //Arrange
        PasswordAuth passwordTest = new PasswordAuth();
        //Act
        boolean test1 = passwordTest.isValidPassword("heya","heyheyhey123");
        //Assert
        assertTrue(test1);
    }

    @org.junit.Test
    public void passwordLengthIsValid() {
        // Arrange
        //Act ( Static class så behøver ikke at instantiere et object
        //true
        boolean sixLetters = PasswordAuth.passwordLengthIsValid("123456");
        boolean fortyLetters = PasswordAuth.passwordLengthIsValid("1234567890123456789012345678901234567890");
        boolean randomAmountInScope = PasswordAuth.passwordLengthIsValid("123456789012345678901");

        //False
        boolean underSix = PasswordAuth.passwordLengthIsValid("12345");
        boolean overForty = PasswordAuth.passwordLengthIsValid("12345678901234567890123456789012345678901");

        //Assert

        assertTrue(sixLetters);
        assertTrue(fortyLetters);
        assertTrue(randomAmountInScope);

        assertFalse(underSix);
        assertFalse(overForty);


    }

    @org.junit.Test
    public void containsCharAndInt() {

        //True
        boolean containsCharAndInt = PasswordAuth.containsCharAndInt("1a");
        //False
        boolean containsChar = PasswordAuth.containsCharAndInt("a");
        boolean containsInt = PasswordAuth.containsCharAndInt("3");
        boolean containsNoCharOrInt = PasswordAuth.containsCharAndInt(" ");

        assertTrue(containsCharAndInt);

        assertFalse(containsChar);
        assertFalse(containsInt);
        assertFalse(containsNoCharOrInt);

    }

    @org.junit.Test
    public void containsRightCharacters() {
    }
}
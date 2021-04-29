package Exceptions.opgaver;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class NemIdAuthorizerTest {

    @Test
    void isValidInput() throws FileNotFoundException {

        // Arrange
        boolean expected = false;
        NemIdAuthorizer objectToTest = new NemIdAuthorizer();
        // Act
        objectToTest.isValidInput("123456789","123321");
        // Assert
        assertEquals(expected, objectToTest.isValidInput("1234567890","12313213"));
    }


}
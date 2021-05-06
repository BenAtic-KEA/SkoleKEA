package Exceptions.opgaver;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class PasswordAuth {
    /**
     * Kontrollerer kodeord ud fra samme krav som til nemID
     * @param username
     * @param password
     * @return boolean

     */
    public static boolean isValidPassword(String username, String password) throws InputMismatchException {

        if(passwordLengthIsValid(password)) {
            if (differentUsernameAndPassword(username, password)) {
                if (noSpaceInStartOrEnd(password)) {
                    if (containsRightCharacters(password)) {
                        if (containsCharAndInt(password)) {
                            if (containsDifferentChars(password)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    //kontrollere om passworded passer med eksisterende password
    public static boolean passwordIsCorrect(String password, String actualPassword){
        return password.equals(actualPassword);
    }

    /**
     * Imellem 6 tegn og 40 tegn
     * @param password
     * @return boolean
     */

    public static boolean passwordLengthIsValid(String password){
        return password.length() <= 40 && password.length() >= 6;
    }
    /**
     *
    Indeholder bogstaver og tal
     */
    public static boolean containsCharAndInt(String password){
        char[] passwordArray = password.toUpperCase().toCharArray();
        String charInPassword = "abcdefghijklmnopqrstuvxyz";
        char[] charInPasswordArray = charInPassword.toUpperCase().toCharArray();
        String intInPassword = "1234567890";

        int intCounter = 0;
        int charCounter = 0;

        for(int i = 0; i < passwordArray.length; i++){


            char currentIndex = passwordArray[i];
            for(int j = 0; j < charInPasswordArray.length; j++){
                if(currentIndex == charInPasswordArray[j]){

                    j = charInPasswordArray.length;
                    charCounter++;
                }
            }
            for(int n = 0; n < intInPassword.toCharArray().length; n++){
                if(currentIndex == toUpperCase(intInPassword.toCharArray()[n])){

                    n = intInPassword.toCharArray().length;
                    intCounter++;
                }
            }
        }
        return intCounter > 0 && charCounter > 0;
    }

    /**
     *  indeholder ikke ÆØÅ
     * @param password
     * @return boolean
     */
    public static boolean containsRightCharacters(String password){
        String upperCasedPassword = password.toUpperCase();

        return !(upperCasedPassword.contains("Æ") || upperCasedPassword.contains("Ø") || upperCasedPassword.contains("Å"));
    }

    public static boolean containsDifferentChars(String password){
        char[] passwordArray = password.toUpperCase().toCharArray();
        int counter = 0;
        char currentLetter = passwordArray[0];

        for(int i = 0; i < passwordArray.length; i++) {
           if (currentLetter == passwordArray[i]) {
               counter++;

               if (counter >= 4) {
                   return false;
               }
           } else {
               counter = 1;
           }

           currentLetter = passwordArray[i];
        }
        return true;
    }

    /**
     * ingen whitespace i starten eller slutningen af koden
     * @param password
     * @return boolean
     */
    public static boolean noSpaceInStartOrEnd(String password){
        String[] passwordArray = password.split("");

        return !(passwordArray[0].equals(" ") || passwordArray[passwordArray.length - 1].equals(" "));
    }

    /**
     * Kontrollere at username og password ikke er det samme
     * @param username
     * @param password
     * @return boolean
     */
    public static boolean differentUsernameAndPassword(String username, String password){

        return !password.toUpperCase().equals(username.toUpperCase());
    }


}
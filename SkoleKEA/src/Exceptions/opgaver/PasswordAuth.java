package Exceptions.opgaver;

import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class PasswordAuth {

    public static boolean passwordIsCorrect(String password, String actualPassword){

        if (password.equals(actualPassword)) {

            return true;

        }
        return false;
    }

    public static boolean passwordLenghtIsValid(String password){
        if(password.length() <= 40 && password.length() >= 6){

        return true;
        }
        return false;
    }


    public static boolean containsCharAndInt(String password){
        char[] passwordArray = password.toCharArray();

        String charInPassword = "abcdefghijklmnopqrstuvxyz";
        char[] charInPasswordArray = charInPassword.toCharArray();
        String intInPassword = "1234567890";

        int intCounter = 0;
        int charCounter = 0;

        for(int i = 0; i < passwordArray.length; i++){


            char currentIndex = toUpperCase(passwordArray[i]);
            for(int j = 0; j < charInPasswordArray.length; j++){
                if(currentIndex == toUpperCase(charInPasswordArray[j])){

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

    public static boolean containsRightCharacters(String password){
        String upperCasedPassword = password.toUpperCase();

        return !(upperCasedPassword.contains("Æ") || upperCasedPassword.contains("Ø") || upperCasedPassword.contains("Å"));
    }

    public static boolean containsDifferentChars(String password){

       char[] passwordArray = password.toCharArray();

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

}



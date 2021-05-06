package Comparable_And_UnitTest;

import static com.sun.tools.javac.util.StringUtils.toUpperCase;

public class LetterToNumberEncryption {

    public String fromStringToNumber(String text){

        if(text.length() == 0){
            return "";
        }
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabetArray = toUpperCase(alphabet).toCharArray();
        char[] textArray = toUpperCase(text).toCharArray();
        String cypherCode = "";

        for(int i = 0; i < textArray.length; i++){
            char currentChar = textArray[i];

            for(int j = 0; j < alphabetArray.length;j++) {
                if (currentChar == alphabetArray[j]) {
                    cypherCode += j + "-";
                    break;
                } else if (j == alphabetArray.length - 1) {
                    cypherCode += "$" + currentChar + "$-";
                }
            }
        }
        return cypherCode.substring(0,cypherCode.length() - 1);
    }
}

package Genopfriskning_1_semester.Opgave6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sortering {

    public static void main(String[] args) {
        sortAlphabetic();
    }


    public static void sortAlphabetic(){
        Scanner word = new Scanner(System.in);
        ArrayList<String> listOfWords = new ArrayList<>();

        for(int i = 0; i <= 4; i++ ){
            String currentWord = word.nextLine();
            listOfWords.add(currentWord);
        }

        Collections.sort(listOfWords);
        Collections.reverse(listOfWords);

        for (String listOfWord : listOfWords) {
            System.out.println(listOfWord);
        }

    }
}

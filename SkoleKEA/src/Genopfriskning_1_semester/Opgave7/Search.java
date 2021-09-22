package Genopfriskning_1_semester.Opgave7;

import doOneTwoThree_Softwareudvikling.A;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Search {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while(run)
        try {
            ArrayList<String> words = new ArrayList<>();
            words.add("Hey");
            words.add("You");
            words.add("World");
            words.add("Hello");
            words.add("There!");

            System.out.println("Word to find index of: ");
            String word = sc.nextLine();
            System.out.println(searchArray(words, word));
            run = false;
        }
        catch (InputMismatchException e){
            System.out.println("Word doesnt exist in the Array");
        }
    }

    public static int searchArray(ArrayList<String> list, String word) throws InputMismatchException {

        for(int i = 0 ; i < list.size(); i++){
            if(list.get(i).equals(word)){
                return i;
            }
        }
        throw new InputMismatchException();
    }
}


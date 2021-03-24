package Exercise3_NumberArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumberArray {

    public static void main(String[] args) {

        arrayOneToHundred();
        System.out.println(arrayOneToHundred());

        System.out.print("enter a number to remove multiplicity of: ");
        removeMultiplies(integerFromUser(),arrayOneToHundred());

    }

    public static ArrayList<Integer> arrayOneToHundred(){
        ArrayList<Integer> oneToHundred = new ArrayList<Integer>();
        for(int i = 1; i <= 100; i++){

            oneToHundred.add(i);
        }
        return oneToHundred;

    }

    public static void removeMultiplies(int number, ArrayList<Integer> oneToHundred ){


        for(int i = number * 2; i <= Collections.max(oneToHundred); i = i + number){

            oneToHundred.remove(Integer.valueOf(i));
        }
        System.out.println(oneToHundred);
    }

    public static int integerFromUser(){

        Scanner userInteger = new Scanner(System.in);

        return userInteger.nextInt();


    }



}

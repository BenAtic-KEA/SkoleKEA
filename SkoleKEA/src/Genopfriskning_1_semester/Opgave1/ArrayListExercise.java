package Genopfriskning_1_semester.Opgave1;

import java.util.ArrayList;

public class ArrayListExercise {

    public static void main(String[] args) {

        ArrayList<String> StringList = new ArrayList<>();

        StringList.add("Hello");
        StringList.add("You");
        StringList.add("And");
        StringList.add("World");

        doesArrayListContainString(StringList,"No");

    }

    public static boolean doesArrayListContainString(ArrayList<String> list, String text){

        for (String textToCheck : list) {
            if (text.equals(textToCheck)) {
                System.out.println("The string has been found");
                return true;
            }
        }
        System.out.println("Not Found! - False");
        return false;
    }
}

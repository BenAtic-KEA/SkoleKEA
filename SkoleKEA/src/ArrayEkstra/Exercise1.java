package ArrayEkstra;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Exercise1 {

    public static void main(String[] args) {

        //Exercise 1
        ArrayList<Integer> numbers = new ArrayList<>();

        oneToTenArray(numbers);

        //Exercise 1.5

        ArrayPrinter<Integer> integerPrinter = new ArrayPrinter<Integer>();

        integerPrinter.printArray(numbers);

        //Exercise 2
        ArrayList<Character> alphabet = new ArrayList<>();

        alphabetArray(alphabet);

        ArrayPrinter<Character> charPrinter = new ArrayPrinter<Character>();

        charPrinter.printArray(alphabet);

        //exercise 3

        System.out.println(smallestElement(numbers));

        // Exercise 4

        System.out.println(howManyLetters(5));

        System.out.println(howManyLetters(10));


    }
    //Exercise 1
    public static void oneToTenArray(ArrayList<Integer> list){

        for(int i = 0; i < 10; i++){

            list.add(i + 1);
        }
    }

    // Exercise 2

    public static void alphabetArray(ArrayList<Character> list){

        for (char c = 'z'; c >= 'a'; c--){

            list.add(c);
        }

    }

    // Exercise 3

    public static int smallestElement(ArrayList<Integer> integerList){

        Iterator<Integer> smallestIntIterator = integerList.iterator();

        int smallestInt = integerList.get(0);

        while(smallestIntIterator.hasNext()){

            int currentInteger = smallestIntIterator.next();
            if(currentInteger < smallestInt){
                smallestInt = currentInteger;
            }
        }

        return smallestInt;
    }

    //Exercise 4

    public static ArrayList<Character> howManyLetters(int n){
        ArrayList<Character> alphabetList = new ArrayList<>();

        char c = 'a';

        for (int i = 0;i < n;i++){

            alphabetList.add(i,c);
            c++;

        }

            return alphabetList;
    }



}

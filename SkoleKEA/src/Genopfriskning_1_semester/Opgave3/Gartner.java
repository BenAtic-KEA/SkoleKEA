package Genopfriskning_1_semester.Opgave3;

import java.util.Scanner;

public class Gartner {

    public static void main(String[] args) {
        whenToMow();
    }

    public static void whenToMow(){
        Scanner numberInput = new Scanner(System.in);

        System.out.println("How long is the grass?");
        double lengthOfGrass = numberInput.nextDouble();

        System.out.println("What is the max length of the grass?");
        double maxLengthOfGrass = numberInput.nextDouble();

        System.out.println(MowCalculator(lengthOfGrass, maxLengthOfGrass));

    }
    private static String MowCalculator(double lengthOfGrass, double maxLengthOfGrass){

        int count = 0;
        for (double i = lengthOfGrass; i < maxLengthOfGrass; i += 0.8 ){
            count++;
        }
        if(count == 0){
            return "You need to mow the lawn now!";
        }
        return "Mow the lawn in " + count + " Days";
    }
}

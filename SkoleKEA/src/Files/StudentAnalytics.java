package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class StudentAnalytics {

    public static void main(String[] args)
            throws FileNotFoundException {
        // lokalisere min csv fil
        File studentFiles = new File("Resources/students.csv");
        // opretter scanner der kan læse filen
        Scanner studentScanner = new Scanner(studentFiles);

        // opretter arraylist til all students
        ArrayList<Student> allStudents = new ArrayList<Student>();


        while (studentScanner.hasNext()) {
            // gemmer nuværende linje
            String currentLine = studentScanner.nextLine();
            // opretter array til linjen
            String[] lineToArray = currentLine.split(";");
            // gemmer String index i passende variabler
            String email = lineToArray[0];
            String fullName = lineToArray[1];
            // opretter en "tempStudent" for at gemme den i arraylisten.
            Student tempStudent = new  Student(email,fullName);
            allStudents.add(tempStudent);

        }
        //Tester min findLongestName metode;
        System.out.println("longest name: " + findLongestName(allStudents));
        // tester howManySimons metode:
        System.out.println("number of simons: " + howManySimons(allStudents));
        // tester averageNameLength metode:
        System.out.println("avg : " + averageNameLength(allStudents));
        // tester maxAmountOfNames metode:
        System.out.println("max amount of names: " + maxAmountOfNames(allStudents));

    }
    public static String findLongestName(ArrayList<Student> studentList) {
        String longestName = studentList.get(0).getFullName();

        for(int i = 1; i<studentList.size();i++){
            if(studentList.get(i).getFullName().length() > longestName.length()) {

                longestName = studentList.get(i).getFullName();
            }
        }
        return longestName;
    }

    public static int howManySimons(ArrayList<Student> studentList){
        int numberOfSimons = 0;

        for(int i = 0; i < studentList.size(); i++)


            if(studentList.get(i).getFullName().contains("Simon")){

                numberOfSimons++;
            }

        return numberOfSimons;
    }

    public static int averageNameLength(ArrayList<Student> studentList){
        int total = 0;
        int avg = 0;

        for(int i = 0; i < studentList.size(); i++){

           total += studentList.get(i).getFullName().length();
           avg = total / studentList.size();

        }
        return avg;

    }

   public static int maxAmountOfNames(ArrayList<Student> studentList) {

       int numberOfNames = 0;

       for (int i = 0; i < studentList.size(); i++) {

           String currentLine = studentList.get(i).getFullName();

           String[] nameToArray = currentLine.split(" ");

           int tempNumberOfNames = nameToArray.length;

           if (tempNumberOfNames > numberOfNames) {

               numberOfNames = tempNumberOfNames;
           }
       }
        return numberOfNames;

   }
}
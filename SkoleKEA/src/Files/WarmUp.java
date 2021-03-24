package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WarmUp {

    public static void main(String[] args)
            throws FileNotFoundException {

        File studentFiles = new File("Resources/students.csv");

        Scanner studentScanner = new Scanner(studentFiles);

        while(studentScanner.hasNext()) {

            String currentLine = studentScanner.nextLine();

            System.out.println(currentLine);

        }


    }
}

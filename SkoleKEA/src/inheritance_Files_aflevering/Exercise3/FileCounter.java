package inheritance_Files_aflevering.Exercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileCounter {
    public static void main(String[] args)
            throws FileNotFoundException {

        // lokalisere min txt fil.
        File howManyWords = new File("SkoleKEA/src/inheritance_Files_aflevering/Exercise1/inheritance");
        // laver en scanner der læser min fil
        Scanner fileReader = new Scanner(howManyWords);

        System.out.println(howManyWords(fileReader));

    }

    // laver en metode der tæller ordene i filen.
    public static int howManyWords(Scanner file)
            throws FileNotFoundException{

        int count = 0;
        // et loop der køre så længe der er en ekstra linje.
        while(file.hasNextLine()) {
            // gemmer linjen i Current Line, så jeg kan lægge den ind i et string Array
            String currentLine = file.nextLine();
            String[] wordsInLine = currentLine.split(" ");

            // jeg laver et loop for hvert index i mit array hvor jeg lægger 1 til "count"
            for (int i = 0; i < wordsInLine.length; i++)

                count++;
        }

        return count;
    }

}

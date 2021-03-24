package Files.StarWars;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StarWarsAnalytics {

    public static void main(String[] args) throws FileNotFoundException {

        File starWarsChars = new File("Resources/star-wars-lore.csv");

        ArrayList<StarWarsCharacter> characterList = characterList(starWarsChars);

        System.out.println("Number of characters: " + characterList.size());

        System.out.println("Number of tatoonie: " + howManyTattoine(characterList(starWarsChars)));

        System.out.println("Most common species: " + mostCommonSpecies(characterList(starWarsChars)));

        System.out.println("Above average mass: " + howManyAboveAverage(characterList(starWarsChars)));

        System.out.println("Is female tallest: " + isFemaleTallest(characterList(starWarsChars)));
        }

        public static ArrayList<StarWarsCharacter> characterList(File characters)
                throws FileNotFoundException {

            ArrayList<StarWarsCharacter> characterList = new ArrayList<>();

            Scanner fileReader = new Scanner(characters);

            fileReader.nextLine();
            while (fileReader.hasNext()) {
                String currentLine = fileReader.nextLine().replaceAll(",", ".");

                String[] currentCharacter = currentLine.split(";");

                String name = currentCharacter[0].trim();

                int height = Integer.parseInt(currentCharacter[1].replace("NA", "0"));
                double mass = Double.parseDouble(currentCharacter[2].replace("NA", "0"));
                String hairColor = currentCharacter[3].trim();
                String eyeColor = currentCharacter[4].trim();
                String birthYear = currentCharacter[5].trim();
                String gender = currentCharacter[6].trim();
                String homeWorld = currentCharacter[7].trim();
                String species = currentCharacter[8].trim();

                StarWarsCharacter tempCharacter = new StarWarsCharacter(name, height, mass, hairColor, eyeColor,
                        birthYear, gender, homeWorld, species);

                characterList.add(tempCharacter);

            }
            return characterList;
        }

    public static int howManyTattoine(ArrayList<StarWarsCharacter> list) {
        int count = 0;

        for (StarWarsCharacter starWarsCharacter : list) {

            if (starWarsCharacter.getHomeWorld().toUpperCase().contains("TATOOINE")) {

                count++;
            }


        }
        return count;
    }


    public static String mostCommonSpecies(ArrayList<StarWarsCharacter> list){
        String species = "NAN";
        int speciesCount = 0;

        for(StarWarsCharacter starWarsCharacter : list ){

            for (StarWarsCharacter warsCharacter : list) {

                int tempSpeciesCount = 0;
                String tempSpecies = starWarsCharacter.getSpecies();

                if (warsCharacter.getSpecies().equals(tempSpecies)) {

                    tempSpeciesCount++;
                }

                if (tempSpeciesCount > speciesCount) {

                    speciesCount = tempSpeciesCount;
                    species = tempSpecies;

                }
            }
        }
        return species;

        }

    public static int howManyAboveAverage(ArrayList<StarWarsCharacter> list){
        double total = 0;
        double avgMass = 0;
        int count = 0;

        for (StarWarsCharacter starWarsCharacter : list){

            total += starWarsCharacter.getMass();
            avgMass = total / list.size();

        }

        for(StarWarsCharacter warsCharacter : list){

            if(warsCharacter.getMass() > avgMass){

                count++;
            }
        }

        return count;
    }



    public static boolean isFemaleTallest(ArrayList<StarWarsCharacter> list){
        double totalMaleHeight = 0;
        double avgMaleHeight = 0;
        int maleCount = 0;
        double totalFemaleHeight = 0;
        double avgFemaleHeight = 0;
        int femaleCount = 0;


        for (StarWarsCharacter starWarsCharacter : list) {

            if(starWarsCharacter.getGender().toUpperCase().equals("FEMALE")){

                totalFemaleHeight += starWarsCharacter.getHeight();
                femaleCount++;
                avgFemaleHeight = totalFemaleHeight / femaleCount;

            }

            if(starWarsCharacter.getGender().toUpperCase().equals("MALE")){

                totalMaleHeight += starWarsCharacter.getHeight();
                maleCount++;
                avgMaleHeight = totalMaleHeight / maleCount;

            }

        }
        return avgFemaleHeight > avgMaleHeight;
    }

}

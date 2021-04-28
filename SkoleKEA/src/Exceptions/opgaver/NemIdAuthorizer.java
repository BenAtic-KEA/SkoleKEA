package Exceptions.opgaver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NemIdAuthorizer {

    public static void main(String[] args) throws FileNotFoundException{




        boolean correctInformation = false;
            while(!correctInformation) {
                try {

                    Scanner userInput = new Scanner(System.in);
                    System.out.println("CprNr:");
                    String cprNr = userInput.nextLine();
                    System.out.println("Password");
                    String password = userInput.nextLine();
                    isValidInput(cprNr, password);
                    System.out.println("User now logged in");
                    correctInformation = isValidInput(cprNr,password);

                } catch (InputMismatchException e) {
                    e.printStackTrace();

                    System.out.println("Wrong length");
                }catch (NoSuchUserException e){

                    System.out.println("User does not exist");
                }

            }
    }

    public static boolean isValidInput(String cprNr, String password) throws InputMismatchException, FileNotFoundException {

        if (cprNr.length() != 10) {
            throw new InputMismatchException();
        }

        for (int i = 0; i < brugerListe().size(); i++) {
            if (cprNr.equals(brugerListe().get(i).getUsername())) {
                if (password.equals(brugerListe().get(i).getPassword())) {
                    return true;
                }
            }

        }
        throw new NoSuchUserException();
    }


    public static ArrayList<NemIdUser> brugerListe() throws FileNotFoundException {

        File users = new File("SkoleKEA/Resources/brugere.csv");

        ArrayList<NemIdUser> userList = new ArrayList<>();

        Scanner fileReader = new Scanner(users);

        String[] specificUser;

        fileReader.nextLine();
        while(fileReader.hasNextLine()){

            String currentLine = fileReader.nextLine();
            specificUser = currentLine.split(";");

            String currentUsername = specificUser[0];
            String currentPassword = specificUser[1];

            NemIdUser currentUser = new NemIdUser(currentUsername,currentPassword);
            userList.add(currentUser);

        }
        return userList;
    }


}

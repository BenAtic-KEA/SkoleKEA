package Exceptions.opgaver;

public class PasswordAuth {

    public static boolean passwordIsCorrect(String password, String actualPassword){

        if (password.equals(actualPassword)) {

            return true;

        }
        return false;
    }

    public static boolean createPasswordIsValid(String password){
        String[] passwordArray = password.split("");
        if(password.length() < 40 && password.length() > 6){


        }
        return false;
    }

    public static boolean containsCharAndInt(String[] passwordArray){
        int intCount = 0;
        int CharCount = 0;
        for(int i = 0; i < passwordArray.length; i++){
            try{
            if( Integer.parseInt(passwordArray[i]){
                intCount++;
                }
            }catch (NumberFormatException e){
                // no number
            }
            try{
                    if( (char)passwordArray[i] != (char)passwordArray[i].contains('1' + '2' + '3' + '4' + '5' + '6' + '7' + '8' + '9' + '0'))
                CharCount++;
                }
            }catch (NumberFormatException e){
                // no number
            }

        }
    }
}



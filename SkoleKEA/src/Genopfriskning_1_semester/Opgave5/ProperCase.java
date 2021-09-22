package Genopfriskning_1_semester.Opgave5;

public class ProperCase {

    public static void main(String[] args) {
        System.out.println(myProperCase("hello you are welcome IN THIS HOUSE"));
    }
    public static String myProperCase(String text){

        String[] wordsInText = text.split(" ");
        String newText = "";

        for(int i = 0; i < wordsInText.length; i++){
            if(!wordsInText[i].equals(wordsInText[i].toUpperCase())){
                if(wordsInText[i].length() > 3){
                    String firstLetter = wordsInText[i].substring(0,1).toUpperCase();
                    String subFirstLetter = wordsInText[i].substring(1).toLowerCase();

                    newText += firstLetter + subFirstLetter + " ";
                } else {
                    String shortWord = wordsInText[i].toLowerCase();
                    newText += shortWord + " ";
                }
            } else {
                newText += wordsInText[i] + " ";
            }
        }
        return newText.substring(0,newText.length() - 1);
    }
}

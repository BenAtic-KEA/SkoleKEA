package Arrays_Aflevering;

public class Exercise2 {
    public static void main(String[] args) {
        //Exercise 2
        String[] Exercise2 = {"hello", "test", "Array", "Number", "What"};

        System.out.println(findString(5, Exercise2));
    }

    // Exercise 2
    public static String findString(int indexNumber, String[] stringArray) {
        int lengthOfArray = stringArray.length;
        //Hvis mit indexNumber lever op til Array størrelsen returner jeg den ønskede String.
        if ((indexNumber <= lengthOfArray) && (indexNumber > 0)) {
            // jeg skriver det sådan for at gøre det mere brugervenligt, så 1 = 1st.
            return stringArray[indexNumber - 1];
        } else {
            // hvis man skriver et indexTal udenfor Array længden sender jeg følgende guide besked:
            return "Your array length is only between 1 and " + lengthOfArray;
        }

    }

}


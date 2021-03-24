package Arrays_Aflevering;

public class Exercise3 {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {1,6,8,2,6,3,20,30,42,3,6,8,21};
        System.out.println(highestNumber(arrayOfNumbers));
    }

    public static int highestNumber(int[] arrayWithNumbers){
        int midwayHighestNumber = 0;

        for (int arrayWithNumber : arrayWithNumbers) {

            if (midwayHighestNumber < arrayWithNumber) {

                midwayHighestNumber = arrayWithNumber;
            }

        }
        return midwayHighestNumber;

    }

}

package array;

public class array {
    public static void main(String[] args) {

        int[] arrayList = {1,2,3,4,5,6,7,8};

        //System.out.println(sumArray(arrayList));

        System.out.println(overFive(arrayList));

    }
        public static int sumArray(int[] numbers){
        int sumNumbers = 0;

            for (int number : numbers) {
                sumNumbers = sumNumbers + number;

            }
            return sumNumbers;
        }


        public static int overFive(int[] numbers){
        int aboveFive = 0;
            for(int indexNumber = 0; indexNumber < numbers.length; indexNumber++){

                if (numbers[indexNumber] > 5){
                    aboveFive++;
                }

            }
            return aboveFive;
        }

}

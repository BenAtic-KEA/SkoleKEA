package Genopfriskning_1_semester.Opgave4;

public class kvadrat {

    public static void main(String[] args) {

        makeSquare(6);
        makeSpecialSquare(6,"H");
    }

    public static void makeSquare(int numberOfMarks){

        for(int i = 1; i <= numberOfMarks; i++){

            for( int j = 1; j <= numberOfMarks; j++){
                if(j != numberOfMarks){
                    System.out.print("*" + "  ");
                } else {
                    System.out.println("*");
                }
            }
        }
    }
    public static void makeSpecialSquare(int numberOfMarks, String sign){

        for(int i = 1; i <= numberOfMarks; i++){
            for( int j = 1; j <= numberOfMarks; j++){
                if(j != numberOfMarks){
                    System.out.print(sign + "  ");
                } else {
                    System.out.println(sign);
                }
            }
        }
    }


}

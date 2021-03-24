package OOP1;

public class Person {

    String name;
    String gender;
    int age;
    double height;

    public Person(String nameOfPerson, String genderOfPerson, int ageOfPerson, double heightOfPerson){

        this.name = nameOfPerson;
        this.gender = genderOfPerson;
        this.age = ageOfPerson;
        this.height = heightOfPerson;

    }

    public String greet(){

        return "Who are you? i wont tell you my name.\nSays the " + height + "meters high " + gender + " person";

        //Alternativ: forskellen er at man ikke altid printer noget når man kalder metoden greet();

        /* System.out.println("Who are you? i wont tell you my name.");
        return "Says the tall (" + height + "meters high) " + gender + " person";
        */


    }

}

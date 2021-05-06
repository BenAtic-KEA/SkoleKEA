package Comparable_And_UnitTest;

public class Person implements Comparable<Person>{

    private String name;
    private double height;
    private int age;

    public Person(String name, double height,int age){
        this.name = name;
        this.height = height;
        this.age = age;

    }


    @Override
    public int compareTo(Person other) {

        if(this.age > other.age) {
            return 1;
        } else if(this.age < other.age){
            return -1;
        } else if(this.height > other.height){
            return 1;
        } else if (this.height < other.height){
            return -1;
        } else{
            return 0;
        }
    }

    @Override
    public String toString(){

        return name + " Age: " + age + " Height: " + height;
    }
}

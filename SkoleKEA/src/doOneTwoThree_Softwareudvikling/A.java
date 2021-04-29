package doOneTwoThree_Softwareudvikling;

public class A {

    private B myB = new B();

    public A(){

    }

    public void doOne(){
        System.out.println("tal = 1");
        myB.doTwo();
        myB.doThree();
    }


}

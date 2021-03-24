package Interface_Polymorphism;

public class Drum implements Playable {

    @Override
    public void playSound(){

        System.out.println("Booom Booom Booom");
    }
}

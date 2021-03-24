package Interface_Polymorphism;
    import java.util.ArrayList;
    import java.util.Random;


public class Main {

    public static void main(String[] args) {

        Guitar instrument1 = new Guitar();
        Trumpet instrument2 = new Trumpet();
        Drum instrument3 = new Drum();


        Playable[] music = new Playable[3];
        ArrayList<Playable> musicList = new ArrayList<>();

        music[0] = (instrument1);
        music[1] = (instrument2);
        music[2] = (instrument3);

        musicList.add(instrument1);
        musicList.add(instrument2);
        musicList.add(instrument3);

        Random randomSound = new Random();
        int randomMusic = randomSound.nextInt(3);

        /*
        for(int i = 0; i < 10; i++){
            music[randomMusic].playSound();

         }*/

        for (int i = 0; i < 10; i++) {

            randomMusic = randomSound.nextInt(3);

            musicList.get(randomMusic).playSound();
        }
    }
}
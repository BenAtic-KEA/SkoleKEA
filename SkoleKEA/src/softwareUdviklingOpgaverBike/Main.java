package softwareUdviklingOpgaverBike;

public class Main {
    public static void main(String[] args) {


    MountainBike mb1 = new MountainBike(22,25,120);
    RacingBike rb1 = new RacingBike(18,50,true);
    CityBike cb1 = new CityBike(2,20,"red");

        System.out.println(mb1);
        System.out.println();

        System.out.println(rb1);
        System.out.println();

        System.out.println(cb1);
}

}

package softwareUdviklingOpgaverBike;

public class MountainBike extends Bike {
    private int seatHeight;

    public MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);

        this.seatHeight = startHeight;

    }

    public void seatHeight(int newValue){

        this.seatHeight = newValue;
    }

    @Override
    public double calculateServicePrice() {
        // Alternativ 250 * 1.1
        double startupFee = RacingBike.getStartupFee() * 1.1; // 10% højere pris end racingBike
        double gearPrice = 7;
        double tax = 1.25;

        return (startupFee + (super.getGear() * gearPrice)) * tax;
    }

    @Override
    public String toString(){


        return  "Mountainbike specific: " + "\nHeight of bike: " + seatHeight + "\n"
                + super.toString();
    }
}

package softwareUdviklingOpgaverBike;

public class RacingBike extends Bike{
    private static double startupFee = 250;
    private boolean carbonFrame;

    public RacingBike(int gear, int speed, boolean carbonFrame) {
        super(gear, speed);
        this.carbonFrame = carbonFrame;
    }

    @Override
    public double calculateServicePrice() {
        //double startupFee = 250;
        double gearPrice = 7;
        double tax = 1.25;


        return (startupFee + (super.getGear() * gearPrice)) * tax;
    }

    public static double getStartupFee() {
        return startupFee;
    }

    @Override
    public String toString() {
        return "RacingBike specific: " +
                "\ncarbonFrame :" + carbonFrame + "\n" + super.toString();
    }
}

package softwareUdviklingOpgaverBike;

public class CityBike extends Bike {

    private String color;

    public CityBike(int gear, int speed, String color) {
        super(gear, speed);
        this.color = color;

    }

    @Override
    public double calculateServicePrice() {
        double startupFee = 200;
        double gearPrice = 7;
        double tax = 1.25;

        return (startupFee + (super.getGear() * gearPrice)) * tax;
    }

}

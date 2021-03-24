package softwareUdviklingOpgaverBike;

import java.sql.SQLOutput;

public abstract class Bike {

    private int gear;
    private int speed;

    public Bike(int gear, int speed){

        this.gear = gear;
        this.speed = speed;
    }


    public void applyBrake(int decrement){

        if((speed - decrement) < 0 ){
            this.speed = 0;
        } else {
            this.speed -= decrement;
        }
    }

    public void speedUp(int increment){

        this.speed += increment;
    }

    public int getGear() {
        return gear;
    }

    public abstract double calculateServicePrice();

    @Override
    public String toString(){
        return "Bike " + "\namount of gears : " + gear + "\n" + "speed of bike: " + speed + "\n" + "Service price: " + calculateServicePrice();
    }




}

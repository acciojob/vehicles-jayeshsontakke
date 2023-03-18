package com.driver;

public class Car extends Vehicle {
    public int wheels;
    public String type;
    public int doors;
    public int gears;
    public  boolean isManual;
    public int currentGear;
    public int seats;



    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
    }

    public Car() {
    }

    public void changeGear(int newGear){

        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){

        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}

package com.driver;

public class Car extends Vehicle {
    public int wheels=0;
    public String type=null;
    public int doors=0;
    public int gears=0;
    public  boolean isManual=true;
    public int currentGear=0;
    public int seats=0;



//    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
//        //Hint: Car extends Vehicle
//    }


    public Car() {
    }

    public void changeGear(int newGear){

        System.out.println("changeGear method called - The gear is changed to: " + newGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){

        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}

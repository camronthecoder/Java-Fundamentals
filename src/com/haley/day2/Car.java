package com.haley.day2;

public class Car {
    private String make;
    private String model;
    private int speed;
    private  int mileage;
    private float gasTankPercent;

    public Car(String make, String model, int speed, int mileage, float gasTankPercent) {
        this.make = make;
        this.model= model;
        this.speed = speed;
        this.mileage = mileage;
        this.gasTankPercent = gasTankPercent;

    }
    public void getInfo() {
        System.out.println( make + " " + model + " " + "top speed is "  + speed +  " m/hr." + "The car's mileage is" + " " + mileage + " miles per gallon and the gas tank percentage is" + " " + gasTankPercent + ".");

    }
}
//make car constructor
//make an instance of a car using constructor
//output info
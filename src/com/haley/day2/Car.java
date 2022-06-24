package com.haley.day2;

public class Car {
    public String make;
    public String model;
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
        System.out.println("The " + make + " " + model + " " + "has a top speed of "  + speed +  " MPH." + "The car gets " + mileage + " miles per gallon and has a gas tank percentage of " + gasTankPercent + " percent.");

    }
}
//make car constructor
//make an instance of a car using constructor
//output info
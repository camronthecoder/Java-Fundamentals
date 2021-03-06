package com.haley.carproject;

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

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public float getGasTankPercent() {
        return gasTankPercent;
    }

    public void setGasTankPercent(float gasTankPercent) {
        this.gasTankPercent = gasTankPercent;
    }

    public void getInfo() {
        System.out.println("The " + make + " " + model + " " + "has a top speed of "  + speed +  " MPH." + "The car gets " + mileage + " miles per gallon and has a gas tank percentage of " + gasTankPercent + " percent.");

    }
    @Override
    public String toString(){
        return make + model + mileage + gasTankPercent*100;
    }
}
//make car constructor
//make an instance of a car using constructor
//output info
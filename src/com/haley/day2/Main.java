package com.haley.day2;


public class Main {

    public static void main(String[] args) {

        Car car1 =  new Car("Audi", "Q8",  200, 20, 0.5f );
        Car car2 =  new Car("Ferrari", "La Ferrari",  250, 12, 0.2f );
        Car car3 =  new Car("Ford", "Mustang",  255, 14, 0.9f );

        car1.getInfo();
        car2.getInfo();
        car3.getInfo();
    }}
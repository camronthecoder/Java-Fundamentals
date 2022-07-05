package com.haley.asktheuser;

import java.util.Scanner;

public class userInterface {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        byteScanner();
        shortScanner();
        intScanner();
        floatScanner();
        longScanner();
        doubleScanner();
    }
    public static void byteScanner (){
        System.out.println("HOw many dogs do you have?");
        byte numberOfDogs = scanner.nextByte();
        System.out.println("You have " + numberOfDogs + " dogs");
    }
    public static void shortScanner(){
        System.out.println("what is the population of your city ? ");
        short population = scanner.nextShort();
        System.out.println(population + " people");

    }
    public static void intScanner (){
        System.out.println("How many cats do you have?");
        int numberOfDogs = scanner.nextInt();
        System.out.println("You have " + numberOfDogs + " cats");
    }
    public static void floatScanner (){
        System.out.println("What is the number pi to the nearest 10th decimal?");
        float piDigits = scanner.nextFloat();
        System.out.println("Pi to the tenth decimal  " + piDigits );
    }
    public static void longScanner (){
        System.out.println("How many people are in the united states?");
        long popOfUSA = scanner.nextLong();
        System.out.println("there are  " + popOfUSA + " people in the US ");
    }
    public static void doubleScanner (){
        System.out.println("To the nearest hundreth decimal how much did the ice cream cost?");
        double assingment = scanner.nextDouble();
        System.out.println("The ice cream cost " + assingment + " dollars");
    }
    public static void booleanScanner (){
        System.out.println("True or False you had breakfast today");
        boolean answer = scanner.nextBoolean();
        System.out.println("you answered " + answer);
    }
    public static void stringScanner (){
        System.out.println("What is your favorite food?");
        String favoriteFood = scanner.nextLine();
        System.out.println("Your favorite food is " + favoriteFood );
    }
}

package com.haley.asktheuser;

import java.util.Scanner;

public class userInterface {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        quiz myQuiz = new quiz(askNumberOfDogs(), askNumberOfFruits(), askCityPopulation(), askPi(), askAmericaPop(), askFreezeTemp(), askBananaColor(),askPresidentName());

    }
    private static byte askNumberOfDogs(){
        System.out.println("How many dogs do you have?");
        byte numberOfDogs = scanner.nextByte();
        if (numberOfDogs>4)
            System.out.println("That's a lot of dogs.");

        else System.out.println("That's a normal amount of dogs.");
        scanner.nextLine();
        return numberOfDogs;
    }
    private static short askNumberOfFruits(){
        System.out.println("How many different fruits are there in the world?");
        short fruitGuess = scanner.nextShort();

        if (fruitGuess ==  2000)
            System.out.println("That is correct, there are 2000 different fruits in the world");
        else
            System.out.println("That is wrong, there are 2000 different fruits");

        scanner.nextLine();
        return fruitGuess;
    }

    private static int askCityPopulation(){
        System.out.println("What is the population of your city?");
        int population = scanner.nextInt();
                if (population>4000)
                    System.out.println("Wow that's a big city!");
                else
                    System.out.println("That's a small city!");
        scanner.nextLine();
        return population;
    }
    private static float askPi(){
        System.out.println("What is the number pi to the nearest 10th decimal?");
        float piDigits = scanner.nextFloat();
        if (piDigits == 3.14f)
            System.out.println("You got it right its 3.14");

        else System.out.println("You got it wrong its 3.14");


        scanner.nextLine();
        return piDigits;
    }
    private static long askAmericaPop() {
        System.out.println("How many millions of people are in the united states?");
        long popOfUSA = scanner.nextLong();
        if (popOfUSA == 300)
            System.out.println("You got it right");

        else System.out.println("You got it wrong its 300 million");

        scanner.nextLine();
        return popOfUSA;

    }
    private static double askFreezeTemp(){
        System.out.println("What degree in F does seawater freeze?");
        double freezeAnswer = scanner.nextDouble();
        if (freezeAnswer == 28.4)
            System.out.println("You got it right");

        else System.out.println("You got it wrong its 28.4 degrees F");
        scanner.nextLine();
        return freezeAnswer;
    }
    private static boolean askBananaColor(){
        System.out.println("True or False: the color of a banana is yellow.");
        boolean answer = scanner.nextBoolean();
        if (answer)
            System.out.println("You got it right");

        else System.out.println("You got it wrong its true");

        scanner.nextLine();
        return answer;

    }
    private static String askPresidentName(){
        System.out.println("What is the last name of the current president?");
        String presidentAnswer = scanner.next();
        if (presidentAnswer == "biden")
            System.out.println("You got it right its President Biden.");

        else System.out.println("You got it wrong its President Biden.");

        scanner.nextLine();
        return presidentAnswer;

    }
}





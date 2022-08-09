package org.example;

import java.util.Random;
import java.util.Scanner;


public class Main {
    private static Scanner scanner;
    public static final int NUMBEROFTRIES=5;
    public static final int BOUND=100;
    public static void main(String[] args) {

        int numberToGuess = selectNumberToGuess(BOUND);

        scanner = new Scanner(System.in);
        printMessage("Welcome in my game. You have 5 tries to guess the number.");
        printMessage("Guess the number from 0 to 99: ");

        for (int i = 1; i <= NUMBEROFTRIES; i++) {
            myGame(numberToGuess, scanner, NUMBEROFTRIES, i);
        }
        printMessage("Game over. Guessing number is: " + numberToGuess);
    }

    private static int selectNumberToGuess(int bound) {
        return new Random().nextInt(bound);
    }

    private static void myGame(int numberToGuess, Scanner scanner, int numberOfTries, int i) {
        int getNumberFromUser;
        getNumberFromUser= scanner.nextInt();
        if (numberToGuess == getNumberFromUser) {
            printMessage("Win!");
            System.exit(0);
        } else if (numberToGuess > getNumberFromUser && i <= numberOfTries) {
            printMessage("Not this time! Your number is greater." + " Tries left: " + i + "/" + numberOfTries);
        } else if (numberToGuess < getNumberFromUser && i <= numberOfTries) {
            printMessage("Not this time! Your number is less." + " Tries left " + i + "/" + numberOfTries);
        }
    }
    private static void printMessage(String x) {
        System.out.println(x);
    }

}













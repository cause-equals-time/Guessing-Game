package com.company;

import java.util.Scanner;

public class GuessingGame {

    private int number;
    private Range rg;

    public GuessingGame(int low, int high) {
        this.rg = new Range(low, high);
        this.number = new RandomNumber().getRandom(this.rg);
    }

    public void play(){
        boolean guessed = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number within range " + this.rg);
        while (!guessed){
            guessed = compare(sc.nextInt());
        }
        System.out.println("Congratulations, you guessed the number!");
    }

    private boolean compare(int input){
        if (input > this.number) System.out.println("Too high! Guess lower");
        if (input < this.number) System.out.println("Too low! Guess higher");
        return input == this.number;
    }
}

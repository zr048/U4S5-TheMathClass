package com.codedifferently.labs.partA;

import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random random = new Random();
        int rounds = 10; //Number of rounds

        for (int i = 0; i < rounds; i++) {
            int number = random.nextInt(3); //Generates random integer between 0 and 2
            String choice;

            if (number == 0) {
                choice = "rock";
            } else if (number == 1) {
                choice = "paper";
            } else {
                choice = "scissors";
            }

            System.out.println("Round " + (i + 1) + ": " + choice);
        }

    }
}

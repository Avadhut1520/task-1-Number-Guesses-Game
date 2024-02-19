package com;


import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int minRange = 1;
	        int maxRange = 100;
	        int attemptsLimit = 5;
	        int score = 0;

	        System.out.println("Welcome to the Number Guessing Game!");

	        boolean playAgain = true;
	        while (playAgain) {
	            int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
	            System.out.println("I've picked a number between " + minRange + " and " + maxRange + ". Guess what it is!");

	            int attempts = 0;
	            boolean guessedCorrectly = false;
	            while (attempts < attemptsLimit) {
	                System.out.print("Enter your guess: ");
	                int guess = scanner.nextInt();
	                attempts++;

	                if (guess == numberToGuess) {
	                    System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts!");
	                    guessedCorrectly = true;
	                    score++;
	                    break;
	                } else if (guess < numberToGuess) {
	                    System.out.println("Too low! Try again.");
	                } else {
	                    System.out.println("Too high! Try again.");
	                }
	            }

	            if (!guessedCorrectly) {
	                System.out.println("Sorry, you've used all your attempts. The correct number was: " + numberToGuess);
	            }

	            System.out.print("Would you like to play again? (yes/no): ");
	            String playAgainInput = scanner.next();
	            playAgain = playAgainInput.equalsIgnoreCase("yes");
	        }

	        System.out.println("Game over! Your final score is: " + score);
	        scanner.close();
	    }
	

}

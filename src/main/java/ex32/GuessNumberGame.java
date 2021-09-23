/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex32;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    private static Scanner input = new Scanner(System.in);
    private static boolean valid = false;
    public static void main(String[] args)
    {
        System.out.println("Let's play Guess the Number! \n");

        boolean playAgain = false;
        while (!playAgain)
        {
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            int challengeLevel = ValidateInput(false);
            PlayGame(challengeLevel);

            System.out.print("Would you like to play again? (y/n) ");
            String in = input.next();

            playAgain = !in.equalsIgnoreCase("y");
        }
    }

    public static void PlayGame(int challengeLevel)
    {
        Random randomNumGen = new Random();
        int randomNum = 0;
        switch(challengeLevel)
        {
            case 1:
            {
                randomNum = randomNumGen.nextInt(10);
                break;
            }
            case 2:
            {
                randomNum = randomNumGen.nextInt(100);
                break;
            }
            case 3:
            {
                randomNum = randomNumGen.nextInt(1000);
                break;
            }
        }

        System.out.print("I have my number. What's your guess? ");

        int guess;
        int count = 0;
        guess = ValidateInput(true);
        while (guess != randomNum)
        {
            if (guess < randomNum)
                System.out.print("Too low. Guess again: ");
            if (guess > randomNum)
                System.out.print("Too high. Guess again: ");

            guess = ValidateInput(true);
            count++;
        }

        System.out.println("You got it in " + count + " guesses!");
    }

    private static int ValidateInput(boolean shortForm)
    {
        int val = 0;
        if (shortForm)
        {
            while (!valid)
            {
                String in = input.next();
                try
                {
                    val = Integer.parseInt(in);
                    valid = true;
                } catch (NumberFormatException ex)
                {
                    System.out.println("Incorrect form of input. Please only guess numbers and try again.");
                }
            }
        }
        else
        {
            while (!valid)
            {
                String in = input.next();
                try
                {
                    val = Integer.parseInt(in);
                    valid = true;
                    if (val < 1 || val > 3)
                    {
                        System.out.println("Incorrect difficulty level, try again.");
                        valid = false;
                    }
                } catch (NumberFormatException ex)
                {
                    System.out.println("Sorry. That's not a valid input. Try again.");
                }
            }
        }
        valid = false;

        return val;
    }
}

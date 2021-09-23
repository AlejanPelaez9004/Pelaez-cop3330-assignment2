/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex33;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MagicEightBall {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("What's your question?");
        System.out.print("> ");
        input.next();

        Random rand = new Random();
        int randomNum = rand.nextInt(3);
        String response = RandomResponse(randomNum);
        System.out.println("\n" + response);
    }

    public static String RandomResponse(int randomNum)
    {
        List<String> availableResponses = new ArrayList<>();
        availableResponses.add("Yes.");
        availableResponses.add("No.");
        availableResponses.add("Maybe.");
        availableResponses.add("Ask again later.");

        String chosen = "";
        switch (randomNum)
        {
            case 0:
            {
                chosen = availableResponses.get(0);
                break;
            }
            case 1:
            {
                chosen = availableResponses.get(1);
                break;
            }
            case 2:
            {
                chosen = availableResponses.get(2);
                break;
            }
            case 3:
            {
                chosen = availableResponses.get(3);
                break;
            }
        }

        return chosen;
    }
}

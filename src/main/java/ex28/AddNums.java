/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex28;
import java.util.Scanner;

public class AddNums {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        float[] numbers = new float[5];
        float total = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = EnterNum();
            total += numbers[i];
        }

        System.out.printf("The total is %.1f", total);
    }

    private static float EnterNum()
    {
        System.out.print("Enter a number: ");
        return input.nextFloat();
    }
}

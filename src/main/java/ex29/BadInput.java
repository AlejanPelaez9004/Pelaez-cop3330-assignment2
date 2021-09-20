/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex29;
import java.util.Scanner;

public class BadInput {
    static Scanner input = new Scanner(System.in);
    static boolean valid = false;
    public static void main(String[] args)
    {
        int rateofReturn = ValidateInput();

        int years = 72 / rateofReturn;
        System.out.println("It will take " + years + " years to double your initial investment.");
    }

    private static int ValidateInput()
    {
        int val = 0;
        while (!valid)
        {
            System.out.print("What is the rate of return? ");
            String in = input.next();
            try
            {
                val = Integer.parseInt(in);
                valid = true;
                if (val == 0)
                {
                    System.out.println("0 is not a valid input.");
                    valid = false;
                }
            } catch (NumberFormatException ex)
            {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
        valid = false;
        return val;
    }

    public static int TestInput(int rateOfReturn)
    {
        while (!valid)
        {
            try
            {
                valid = true;
                if (rateOfReturn == 0)
                {
                    System.out.println("0 is not a valid input.");
                    valid = false;
                    return -999;
                }
            } catch (NumberFormatException ex)
            {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
        valid = false;
        return 72 / rateOfReturn;
    }
}

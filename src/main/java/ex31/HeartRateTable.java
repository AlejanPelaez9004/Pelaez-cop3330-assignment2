/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex31;
import java.util.Scanner;

public class HeartRateTable {
    static Scanner input  = new Scanner(System.in);
    static boolean valid = false;
    public static void main(String[] args)
    {
        int pulse = ValidateInput("Resting Pulse: ");
        int age = ValidateInput("Age: ");

        PrintTable(pulse, age);
    }

    public static String PrintTable(int pulse, int age)
    {
        StringBuilder output = new StringBuilder();
        output.append("Intensity\t | Rate\n");
        for (int i = 0; i < 24; i++)
        {
            if (i == 13)
            {
                output.append("|");
                continue;
            }
            output.append("-");
        }

        output.append("\n");
        float intense;
        for (intense = 0.55f; intense < 0.96f; intense += 0.05f)
        {
            float TargetHeartRate = (((220 - age) - pulse) * intense) + pulse;
            output.append(Math.round(intense * 100)).append("%\t\t\t | ").append(Math.round(TargetHeartRate)).append(" bpm\n");
        }
        System.out.print(output);
        return String.valueOf(output);
    }

    private static int ValidateInput(String prompt)
    {
        int val = 0;
        while (!valid)
        {
            System.out.print(prompt);
            String in = input.next();
            try
            {
                val = Integer.parseInt(in);
                valid = true;
            } catch (NumberFormatException ex)
            {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
        valid = false;
        return val;
    }
}

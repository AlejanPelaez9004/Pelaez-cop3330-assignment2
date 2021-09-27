/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex38;
import java.util.ArrayList;
import java.util.Scanner;

public class FilterValues {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String nums = input.nextLine();
        char[] numCharArray = nums.replace(" ", "").toCharArray();
        ArrayList<Integer> ints = new ArrayList<>();
        for (char c : numCharArray)
            ints.add(Integer.parseInt(String.valueOf(c)));

        ArrayList<Integer> filteredEvens = filterEvenNumbers(ints);
        PrintOutput(filteredEvens);
    }

    public static ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> passedInts)
    {
        ArrayList<Integer> filteredEvens = new ArrayList<>();
        for (Integer num : passedInts)
        {
            if (num % 2 == 0)
                filteredEvens.add(num);
        }
        return filteredEvens;
    }

    private static void PrintOutput(ArrayList<Integer> filteredEvens)
    {
        System.out.print("The even numbers are");
        for (Integer even : filteredEvens)
            System.out.printf(" %d", even);
    }
}

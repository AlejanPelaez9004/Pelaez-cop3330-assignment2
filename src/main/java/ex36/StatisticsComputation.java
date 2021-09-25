/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex36;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class StatisticsComputation {
    private static Scanner input = new Scanner(System.in);
    private static double average, max, min, std;
    public static void main(String[] args)
    {
        ArrayList<String> numbers = new ArrayList<String>();

        String numberToAdd = "";
        while (!Objects.equals(numberToAdd, "done"))
        {
            System.out.print("Enter a number: ");
            numberToAdd = input.next();
            if (!Objects.equals(numberToAdd, "done"))
            {
                for (int i = 0; i < numberToAdd.length(); i++)
                {
                    if (Character.isDigit(numberToAdd.toCharArray()[i]) && !numbers.contains(numberToAdd))
                        numbers.add(numberToAdd);
                }
            }
        }

        ArrayList<Double> doubleNums = ConvertToDouble(numbers);
        if (doubleNums.size() > 0)
        {
            average = CalculateAvg(doubleNums);
            min = CalculateMin(doubleNums);
            max = CalculateMax(doubleNums);
            std = CalculateStd(doubleNums);
        }
        else
            System.out.println("Numbers list is empty");

        PrintOutput(doubleNums);
    }

    private static ArrayList<Double> ConvertToDouble(ArrayList<String> numbers)
    {
        ArrayList<Double> numbersDouble = new ArrayList<>();
        for (String number : numbers) {
            numbersDouble.add(Double.parseDouble(number));
        }
        return numbersDouble;
    }

    private static void PrintOutput(ArrayList<Double> numbers)
    {
        System.out.print("Numbers: ");
        for (Double number : numbers) {
            System.out.printf("%.0f, ", number);
        }
        System.out.println("\nThe average is: " + average);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
        System.out.printf("The standard deviation is: %.2f\n", std);
    }

    public static double CalculateAvg(ArrayList<Double> numbers)
    {
        double total = 0;
        for (Double number : numbers) {
            total += number;
        }

        return total / numbers.size();
    }

    public static double CalculateMin(ArrayList<Double> numbers)
    {
        double smallest = 99999;
        for (Double number : numbers) {
            if (number < smallest)
                smallest = number;
        }
        return smallest;
    }

    public static double CalculateMax(ArrayList<Double> numbers)
    {
        double biggest = 0;
        for (Double number : numbers) {
            if (number > biggest)
                biggest = number;
        }
        return biggest;
    }

    public static double CalculateStd(ArrayList<Double> numbers)
    {
        double tempStd = 0, sum = 0;
        for(double num : numbers) {
            sum += num;
        }

        double mean = sum/numbers.size();

        for(double num: numbers) {
            tempStd += Math.pow(num - mean, 2);
        }

        return Math.sqrt(tempStd/numbers.size());
    }
}


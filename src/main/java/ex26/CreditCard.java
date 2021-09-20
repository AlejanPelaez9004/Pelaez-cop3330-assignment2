/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex26;
import java.util.Scanner;

public class CreditCard {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        double balance = ReturnInput("What is your balance? ");
        double APR = ReturnInput("What is the APR on the card (as a percent)? ");
        double monthPay = ReturnInput("What is the monthly payment you can make? ");

        PaymentCalculator PC = new PaymentCalculator();
        int numMonths = PC.calculateMonthsUntilPaidOff(balance, APR, monthPay);

        PrintNumMonths(numMonths);
    }

    private static float ReturnInput(String prompt)
    {
        System.out.print(prompt);
        return input.nextFloat();
    }

    private static void PrintNumMonths(int numMonths)
    {
        System.out.printf("It will take you %d months to pay off this card.\n", numMonths);
    }
}

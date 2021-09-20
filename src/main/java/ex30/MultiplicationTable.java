/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex30;

public class MultiplicationTable {
    public static void main(String[] args)
    {
        PrintTable();
    }

    private static void PrintTable()
    {
        int row;
        int column;
        for (row = 1; row <= 12; row++)
        {
            for (column = 1; column <= 12; column++)
            {
                System.out.printf("%4d", (row*column));
            }
            System.out.print("\n");
        }
    }
}

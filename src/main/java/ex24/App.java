/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex24;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

public class App
{
    static Scanner input = new Scanner(System.in);

    public static void main( String[] args )
    {
        System.out.print("Enter two strings and I'll tell you if they are anagrams: \n");
        String first = EnterString(true);
        String second = EnterString(false);

        System.out.println(PrintAnagramResult(isAnagram(first.toCharArray(), second.toCharArray()), first, second));
    }

    public static String EnterString(boolean order)
    {
        String temp = order ? "first" : "second";
        System.out.print("Enter the " + temp + " string: ");
        return input.next();
    }

    public static boolean isAnagram(char[] first, char[] second)
    {
        if (first.length != second.length)
            return false;

        Arrays.sort(first);
        Arrays.sort(second);

        for (int i = 0; i < first.length; i++)
        {
            if (first[i] != second[i])
                return false;
        }
        return true;
    }

    public static String PrintAnagramResult(boolean isAnagram, String first, String second)
    {
        if (isAnagram)
            return (first + " and " + second + " are anagrams.");
        else
            return (first + " and " + second + " are not anagrams.");
    }
}

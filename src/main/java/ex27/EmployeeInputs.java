/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex27;
import java.util.Scanner;

public class EmployeeInputs
{
    static Scanner input = new Scanner(System.in);
    static String firstEmpty = "";
    static String secondEmpty = "";
    static String firstShort = "";
    static String secondShort = "";
    static String zipInvalid = "";
    static String idInvalid = "";

    public static void main( String[] args )
    {
        String first = EnterInputs("Enter the first name: ");
        String last = EnterInputs("Enter the last name: ");
        String zip = EnterInputs("Enter the ZIP code: ");
        String ID = EnterInputs("Enter the employee ID: ");

        ValidateNames(first, last);
        ValidateZip(zip);
        ValidateID(ID);

        PrintOutput();
    }

    private static String EnterInputs(String prompt)
    {
        System.out.print(prompt);
        return input.nextLine();
    }

    private static void ValidateNames(String first, String last)
    {
        if (first.length() == 0)
            firstEmpty = "The first name must be filled in.\n";
        if (last.length() == 0)
            secondEmpty = "The last name must be filled in.\n";
        if (first.length() <= 2)
            firstShort = "The first name must be at least 2 characters long.\n";
        if (last.length() <= 2)
            secondShort = "The last name must be at least 2 characters long.\n";
    }

    private static void ValidateZip(String zip)
    {
        char[] zipChar = zip.toCharArray();
        for (char c : zipChar)
        {
            if (Character.isAlphabetic(c))
                zipInvalid = "The zipcode must be a 5 digit number.\n";
        }
    }

    private static void ValidateID(String ID)
    {
        char[] idChar = ID.toCharArray();
        if (idChar.length < 2)
        {
            idInvalid = "The employee ID must be in the format of AA-1234.";
            return;
        }

        for (int i = 0;  i < 2; i++)
        {
            if (!Character.isAlphabetic(idChar[i]))
            {
                idInvalid = "The employee ID must be in the format of AA-1234.";
                return;
            }
        }

        if (idChar[2] != '-')
        {
            idInvalid = "The employee ID must be in the format of AA-1234.";
            return;
        }

        for (int i = 3; i < idChar.length; i++)
        {
            if (!Character.isDigit(idChar[i]))
            {
                idInvalid = "The employee ID must be in the format of AA-1234.";
                return;
            }
        }
    }

    private static void PrintOutput()
    {
        System.out.printf("%s%s%s%s%s%s", firstEmpty, firstShort, secondEmpty, secondShort, zipInvalid, idInvalid);
    }
}

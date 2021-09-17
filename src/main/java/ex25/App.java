/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex25;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        String password = EnterPassword();

        PasswordValidator PV = new PasswordValidator();

        int result = PV.validatePassword(password);

        PrintResult(result, password);
    }

    public static String EnterPassword()
    {
        System.out.print("Enter the password: ");
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    public static void PrintResult(int result, String password)
    {
        String resultString = "";
        switch (result)
        {
            case 1:
                resultString = "The password " + password + " is a very weak password.";
                break;
            case 2:
                resultString = "The password " + password + " is a weak password.";
                break;
            case 3:
                resultString = "The password " + password + " is a strong password.";
                break;
            case 4:
                resultString = "The password " + password + " is a very strong password.";
                break;
        }

        System.out.println(resultString);
    }
}

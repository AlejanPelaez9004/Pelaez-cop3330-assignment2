/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex37;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PassGen {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        int length = ScanInput("What's the minimum length? ");
        int special = ScanInput("How many special characters? ");
        int nums = ScanInput("How many numbers? ");

        String password = GeneratePassword(length, special, nums);
        PrintOutput(password);
    }

    public static String GeneratePassword(int l, int s, int n)
    {
        char[] passCharacter = new char[l];
        StringBuilder generatedPass = new StringBuilder();
        Random randomNumIndex = new Random();
        Random randomSpecialIndex = new Random();
        ArrayList<Integer> numIndexes = new ArrayList<>();
        ArrayList<Character> specialIndexes = new ArrayList<>();

        for (int i = 0; i < l; i++)
        {
            SecureRandom random = new SecureRandom();
            passCharacter[i] = (char) (random.nextInt('z' - 'a') + 'a');
            generatedPass.append(passCharacter[i]);
        }

        for (int i = 0; i < n; i++)
        {
            numIndexes.add(randomNumIndex.nextInt(l));
            generatedPass.append(numIndexes.get(i));
        }

        for (int i = 0; i < s; i++)
        {
            specialIndexes.add((char) (randomSpecialIndex.nextInt(')' - '!') + ')'));
            if (Character.isDigit(specialIndexes.get(i)))
            {
                i--;
                specialIndexes.remove(i);
                continue;
            }
            generatedPass.append(specialIndexes.get(i));
        }

        return generatedPass.toString();
    }

    private static void PrintOutput(String password)
    {
        System.out.println("Your password is " + password);
    }

    private static Integer ScanInput(String prompt)
    {
        System.out.print(prompt);
        return input.nextInt();
    }
}

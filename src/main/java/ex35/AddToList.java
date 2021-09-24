/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex35;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class AddToList {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();

        String nameToAdd = "Start";
        while (!Objects.equals(nameToAdd, ""))
        {
            System.out.print("Enter a name: ");
            nameToAdd = input.nextLine();
            if (!Objects.equals(nameToAdd, ""))
                names.add(nameToAdd);
        }

        if (names.size() > 0)
            SelectRandomly(names);
        else
            System.out.println("Names list is empty");
    }

    public static void SelectRandomly(ArrayList<String> names)
    {
        Random random = new Random();
        int randomNum = random.nextInt(names.size());

        System.out.println("The winner is... " + names.get(randomNum));
    }
}

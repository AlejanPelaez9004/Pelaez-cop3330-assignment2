/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex34;
import java.util.Scanner;


public class RemoveEmployee {
    private static Scanner input = new Scanner(System.in);
    public static EmployeeList list = new EmployeeList();
    public static void main(String[] args)
    {
        PrintList();
        System.out.print("Enter an employee name to remove: ");
        String name = input.nextLine();

        RemoveEmployeeFromList(name);
        PrintList();
    }

    public static void RemoveEmployeeFromList(String employee)
    {
        for (int i = 0; i < list.employees.size(); i++)
        {
            if (list.employees.get(i).equalsIgnoreCase(employee))
                list.employees.remove(employee);
        }
    }

    private static void PrintList()
    {
        System.out.println("There are " + list.employees.size() + " employees:");
        for (int i = 0; i < list.employees.size(); i++)
        {
            System.out.println(list.employees.get(i));
        }
        System.out.print("\n");
    }
}

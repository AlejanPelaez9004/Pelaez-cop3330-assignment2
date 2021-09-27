/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex40;

import ex38.FilterValues;

import java.util.*;

public class FilterEmployees {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter a search string: ");
        String search = input.next();

        List<Map<String, String>> sorted = SortEmployees(GetEmployees(), "Last Name");
        List<Map<String, String>> filtered = FilterEmployeesBySearch(sorted, search);
        PrintOutput(filtered);
    }

    public static Map<String, String> CombineMap(String first, String last, String pos, String separation)
    {
        return Map.of("First Name", first, "Last Name", last, "Position", pos, "Separation Date", separation);
    }

    public static List<Map<String,String>> GetEmployees()
    {
        return Arrays.asList(CombineMap("John", "Johnson", "Manager", "2016-12-31"),
                CombineMap("Tou", "Xiong", "Software Engineer", "2016-10-05"),
                CombineMap("Michaela", "Michaelson", "District Manager", "2015-12-19"),
                CombineMap("Jake", "Jacobson", "Programmer", ""),
                CombineMap("Jacquelyn", "Jackson", "DBA", ""),
                CombineMap("Sally", "Weber", "Web Developer", "2015-12-18"));
    }

    public static List<Map<String,String>> SortEmployees(List<Map<String, String>> employees, String sortBy) {
        Comparator<Map<String, String>> comparator = Comparator.comparing((Map<String, String> m) -> m.get(sortBy));
        employees.sort(comparator);
        return employees;
    }

    public static List<Map<String, String>> FilterEmployeesBySearch(List<Map<String, String>> sortedEmployees, String search)
    {
        List<Map<String, String>> filtered = new ArrayList<>();
        for (Map<String, String> sortedEmployee : sortedEmployees) {
            if (sortedEmployee.get("First Name").contains(search) || sortedEmployee.get("Last Name").contains(search))
                filtered.add(sortedEmployee);
        }
        return filtered;
    }

    private static void PrintOutput(List<Map<String, String>> employees)
    {
        System.out.println("Name\t\t\t\t| Position\t\t\t| Separation Date");
        System.out.println("--------------------|-------------------|----------------");
        for (Map<String, String> employee : employees) {
            System.out.printf("%-20s| %-18s| %s%n", employee.get("First Name") + " " +
                            employee.get("Last Name"),
                    employee.get("Position"),
                    employee.get("Separation Date"));
        }
    }
}

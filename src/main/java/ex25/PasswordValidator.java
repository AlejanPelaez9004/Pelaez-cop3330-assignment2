/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex25;

public class PasswordValidator {
    public int validatePassword(String password)
    {
        int digits = 0;
        int chars = 0;
        int special = 0;
        for (int i = 0; i < password.length(); i++)
        {
            boolean digit = Character.isDigit(password.toCharArray()[i]);
            if (digit)
                digits++;
            boolean alphabetic = Character.isAlphabetic(password.toCharArray()[i]);
            if (alphabetic)
                chars++;
            if (!Character.isSpaceChar(password.toCharArray()[i]) && !alphabetic && !digit)
                special++;
        }

        if (password.length() < 8)
        {
            if (chars == 0)
                return 1;
            if (digits == 0)
                return 2;
        }
        else
        {
            if (special > 1)
                return 4;
            if (digits > 1 && chars > 1)
                return 3;
        }
        return 1;
    }
}

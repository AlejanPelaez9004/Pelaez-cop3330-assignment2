/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void veryWeakPassword() {

        PasswordValidator pValidClass = new PasswordValidator();

        int actual = pValidClass.validatePassword("12345");
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    void weakPassword() {

        PasswordValidator pValidClass = new PasswordValidator();

        int actual = pValidClass.validatePassword("abcdef");
        int expected = 2;

        assertEquals(actual, expected);
    }

    @Test
    void strongPassword() {

        PasswordValidator pValidClass = new PasswordValidator();

        int actual = pValidClass.validatePassword("abc123xyz");
        int expected = 3;

        assertEquals(actual, expected);
    }

    @Test
    void veryStrongPassword() {

        PasswordValidator pValidClass = new PasswordValidator();

        int actual = pValidClass.validatePassword("1337h@xor!");
        int expected = 4;

        assertEquals(actual, expected);
    }
}
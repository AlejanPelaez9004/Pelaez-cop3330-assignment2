/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex24;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void isAnagram() {
        App myApp = new App();
        String expected = "note and tone are anagrams.";
        String result = App.PrintAnagramResult(true, "note", "tone");

        assertEquals(expected, result);
    }

    @Test
    public void isNotAnagram() {
        App myApp = new App();
        String expected = "note and tones are not anagrams.";
        String result = App.PrintAnagramResult(false, "note", "tones");
        assertEquals(expected, result);
    }
}
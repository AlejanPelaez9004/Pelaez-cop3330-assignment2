package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void passwordValidator_testing_very_weak_password() {

        PasswordValidator pValidClass = new PasswordValidator();

        int actual = pValidClass.validatePassword("12345");
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    void passwordValidator_testing_weak_password() {

        PasswordValidator pValidClass = new PasswordValidator();

        int actual = pValidClass.validatePassword("abcdef");
        int expected = 2;

        assertEquals(actual, expected);
    }

    @Test
    void passwordValidator_testing_strong_password() {

        PasswordValidator pValidClass = new PasswordValidator();

        int actual = pValidClass.validatePassword("abc123xyz");
        int expected = 3;

        assertEquals(actual, expected);
    }

    @Test
    void passwordValidator_testing_very_strong_password() {

        PasswordValidator pValidClass = new PasswordValidator();

        int actual = pValidClass.validatePassword("1337h@xor!");
        int expected = 4;

        assertEquals(actual, expected);
    }
}
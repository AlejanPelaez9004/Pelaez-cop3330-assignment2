package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadInputTest {

    @Test
    void testInput() {
        int actual = BadInput.TestInput(4);
        int expected = 18;
        assertEquals(expected, actual);
    }
}
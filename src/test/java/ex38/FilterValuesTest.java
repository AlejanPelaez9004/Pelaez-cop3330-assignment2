package ex38;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FilterValuesTest {

    @Test
    void filterEvenNumbers() {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i < 9; i++)
        {
            nums.add(i);
        }

        assertEquals("[2, 4, 6, 8]", FilterValues.filterEvenNumbers(nums).toString());
    }
}
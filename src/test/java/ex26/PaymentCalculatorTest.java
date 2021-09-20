package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    @Test
    void calculateMonthsUntilPaidOff() {
        PaymentCalculator PC = new PaymentCalculator();
        int actual = PC.calculateMonthsUntilPaidOff(5000, 12, 100);
        assertEquals(70, actual);
    }
}
package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsComputationTest {

    @Test
    void calculateAvg() {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(100.0);
        numbers.add(200.0);
        numbers.add(1000.0);
        numbers.add(300.0);
        assertEquals(400.0, StatisticsComputation.CalculateAvg(numbers));
    }

    @Test
    void calculateMin() {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(100.0);
        numbers.add(200.0);
        numbers.add(1000.0);
        numbers.add(300.0);
        assertEquals(100.0, StatisticsComputation.CalculateMin(numbers));
    }

    @Test
    void calculateMax() {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(100.0);
        numbers.add(200.0);
        numbers.add(1000.0);
        numbers.add(300.0);
        assertEquals(1000.0, StatisticsComputation.CalculateMax(numbers));
    }

    @Test
    void calculateStd() {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(100.0);
        numbers.add(200.0);
        numbers.add(1000.0);
        numbers.add(300.0);
        assertEquals(353.5533905932738, StatisticsComputation.CalculateStd(numbers));
    }
}
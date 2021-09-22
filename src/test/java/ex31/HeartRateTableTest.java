package ex31;

import org.junit.jupiter.api.Test;

import java.awt.print.Printable;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateTableTest {

    @Test
    void printTable() {
        String expectation = "Intensity\t | Rate\n" +
                "-------------|----------\n" +
                "55%\t\t\t | 138 bpm\n" +
                "60%\t\t\t | 145 bpm\n" +
                "65%\t\t\t | 151 bpm\n" +
                "70%\t\t\t | 158 bpm\n" +
                "75%\t\t\t | 165 bpm\n" +
                "80%\t\t\t | 171 bpm\n" +
                "85%\t\t\t | 178 bpm\n" +
                "90%\t\t\t | 185 bpm\n" +
                "95%\t\t\t | 191 bpm\n";

        assertEquals(HeartRateTable.PrintTable(65, 22), expectation);
    }
}
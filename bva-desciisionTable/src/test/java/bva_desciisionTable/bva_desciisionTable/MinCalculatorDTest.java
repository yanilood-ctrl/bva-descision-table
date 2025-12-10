package bva_desciisionTable.bva_desciisionTable;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MinCalculatorDTest {

    // ---------- בדיקות Multi-Field BVA למשתנה d ----------
    // טווח חוקי: 1–1000

    // d min-1 = 0  → צריך לזרוק חריגה
    @Test
    void d_minMinus1_shouldThrowException() {
        int a = 500, b = 500, c = 500, d = 0,   e = 500;

        assertThrows(IllegalArgumentException.class, () -> {
            MinCalculator.findMin(a, b, c, d, e);
        });
    }

    // d min = 1  → המינימום הוא 1
    @Test
    void d_min_shouldReturn1() {
        int a = 500, b = 500, c = 500, d = 1,   e = 500;

        int result = MinCalculator.findMin(a, b, c, d, e);
        assertEquals(1, result);
    }

    // d min+1 = 2  → המינימום הוא 2
    @Test
    void d_minPlus1_shouldReturn2() {
        int a = 500, b = 500, c = 500, d = 2,   e = 500;

        int result = MinCalculator.findMin(a, b, c, d, e);
        assertEquals(2, result);
    }

    // d nominal = 500  → המינימום הוא 500
    @Test
    void d_nominal_shouldReturn500() {
        int a = 500, b = 500, c = 500, d = 500, e = 500;

        int result = MinCalculator.findMin(a, b, c, d, e);
        assertEquals(500, result);
    }

    // d max-1 = 999  → המינימום הוא 500
    @Test
    void d_maxMinus1_shouldReturn500() {
        int a = 500, b = 500, c = 500, d = 999, e = 500;

        int result = MinCalculator.findMin(a, b, c, d, e);
        assertEquals(500, result);
    }

    // d max = 1000  → המינימום הוא 500
    @Test
    void d_max_shouldReturn500() {
        int a = 500, b = 500, c = 500, d = 1000, e = 500;

        int result = MinCalculator.findMin(a, b, c, d, e);
        assertEquals(500, result);
    }

    // d max+1 = 1001  → צריך לזרוק חריגה
    @Test
    void d_maxPlus1_shouldThrowException() {
        int a = 500, b = 500, c = 500, d = 1001, e = 500;

        assertThrows(IllegalArgumentException.class, () -> {
            MinCalculator.findMin(a, b, c, d, e);
        });
    }
}

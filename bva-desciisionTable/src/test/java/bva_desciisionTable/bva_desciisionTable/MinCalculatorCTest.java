package bva_desciisionTable.bva_desciisionTable;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MinCalculatorCTest {

    // ---------- בדיקות Multi-Field BVA למשתנה c ----------
    // טווח חוקי לפי השאלה: 1–1000

    // c min-1 = 0  → צריך לזרוק חריגה
    @Test
    void c_minMinus1_shouldThrowException() {
        int a = 500, b = 500, c = 0, d = 500, e = 500;

        assertThrows(IllegalArgumentException.class, () -> {
            MinCalculator.findMin(a, b, c, d, e);
        });
    }

    // c min = 1  → המינימום הוא 1
    @Test
    void c_min_shouldReturn1() {
        int a = 500, b = 500, c = 1, d = 500, e = 500;

        int result = MinCalculator.findMin(a, b, c, d, e);
        assertEquals(1, result);
    }

    // c min+1 = 2  → המינימום הוא 2
    @Test
    void c_minPlus1_shouldReturn2() {
        int a = 500, b = 500, c = 2, d = 500, e = 500;

        int result = MinCalculator.findMin(a, b, c, d, e);
        assertEquals(2, result);
    }

    // c nominal = 500  → המינימום הוא 500
    @Test
    void c_nominal_shouldReturn500() {
        int a = 500, b = 500, c = 500, d = 500, e = 500;

        int result = MinCalculator.findMin(a, b, c, d, e);
        assertEquals(500, result);
    }

    // c max-1 = 999  → המינימום הוא 500
    @Test
    void c_maxMinus1_shouldReturn500() {
        int a = 500, b = 500, c = 999, d = 500, e = 500;

        int result = MinCalculator.findMin(a, b, c, d, e);
        assertEquals(500, result);
    }

    // c max = 1000  → המינימום הוא 500
    @Test
    void c_max_shouldReturn500() {
        int a = 500, b = 500, c = 1000, d = 500, e = 500;

        int result = MinCalculator.findMin(a, b, c, d, e);
        assertEquals(500, result);
    }

    // c max+1 = 1001  → צריך לזרוק חריגה
    @Test
    void c_maxPlus1_shouldThrowException() {
        int a = 500, b = 500, c = 1001, d = 500, e = 500;

        assertThrows(IllegalArgumentException.class, () -> {
            MinCalculator.findMin(a, b, c, d, e);
        });
    }
}

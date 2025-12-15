package bva_desciisionTable.bva_desciisionTable;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BVACTest {

    // c min-1 = 0 -> חריגה
    @Test
    void c_minMinus1_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () ->
            MinCalculator.findMin(500, 500, 0, 500, 500)
        );
    }

    // c min = 1
    @Test
    void c_min_shouldReturn1() {
        int result = MinCalculator.findMin(500, 500, 1, 500, 500);
        assertEquals(1, result);
    }

    // c min+1 = 2
    @Test
    void c_minPlus1_shouldReturn2() {
        int result = MinCalculator.findMin(500, 500, 2, 500, 500);
        assertEquals(2, result);
    }

    // c nominal = 500
    @Test
    void c_nominal_shouldReturn500() {
        int result = MinCalculator.findMin(500, 500, 500, 500, 500);
        assertEquals(500, result);
    }

    // c max-1 = 999
    @Test
    void c_maxMinus1_shouldReturn500() {
        int result = MinCalculator.findMin(500, 500, 999, 500, 500);
        assertEquals(500, result);
    }

    // c max = 1000
    @Test
    void c_max_shouldReturn500() {
        int result = MinCalculator.findMin(500, 500, 1000, 500, 500);
        assertEquals(500, result);
    }

    // c max+1 = 1001 -> חריגה
    @Test
    void c_maxPlus1_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () ->
            MinCalculator.findMin(500, 500, 1001, 500, 500)
        );
    }
}

package bva_desciisionTable.bva_desciisionTable;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BVADTest {

    // d min-1 = 0 -> חריגה
    @Test
    void d_minMinus1_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () ->
            MinCalculator.findMin(500, 500, 500, 0, 500)
        );
    }

    // d min = 1
    @Test
    void d_min_shouldReturn1() {
        int result = MinCalculator.findMin(500, 500, 500, 1, 500);
        assertEquals(1, result);
    }

    // d min+1 = 2
    @Test
    void d_minPlus1_shouldReturn2() {
        int result = MinCalculator.findMin(500, 500, 500, 2, 500);
        assertEquals(2, result);
    }

    // d nominal = 500
    @Test
    void d_nominal_shouldReturn500() {
        int result = MinCalculator.findMin(500, 500, 500, 500, 500);
        assertEquals(500, result);
    }

    // d max-1 = 999
    @Test
    void d_maxMinus1_shouldReturn500() {
        int result = MinCalculator.findMin(500, 500, 500, 999, 500);
        assertEquals(500, result);
    }

    // d max = 1000
    @Test
    void d_max_shouldReturn500() {
        int result = MinCalculator.findMin(500, 500, 500, 1000, 500);
        assertEquals(500, result);
    }

    // d max+1 = 1001 -> חריגה
    @Test
    void d_maxPlus1_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () ->
            MinCalculator.findMin(500, 500, 500, 1001, 500)
        );
    }
}

package bva_desciisionTable.bva_desciisionTable;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CoinDecisionRulesTest {

    private final CoinDecision coinDecision = new CoinDecision();

    // R1|R2|R3|R4 : H H H H -> Positive
    @Test
    void ruleR1_R2_R3_R4_shouldReturnPositive() {
        String result = coinDecision.CoinDecision("H", "H", "H", "H");
        assertEquals("Positive", result);
    }

    // R16|R15 : T T T T -> Negative
    @Test
    void ruleR16_R15_shouldReturnNegative() {
        String result = coinDecision.CoinDecision("T", "T", "T", "T");
        assertEquals("Negative", result);
    }

    // R5|R6 : H T H T -> Positive
    @Test
    void ruleR5_R6_shouldReturnPositive() {
        String result = coinDecision.CoinDecision("H", "T", "H", "T");
        assertEquals("Positive", result);
    }

    // R9|R10 : T H H H -> Positive
    @Test
    void ruleR9_R10_shouldReturnPositive() {
        String result = coinDecision.CoinDecision("T", "H", "H", "H");
        assertEquals("Positive", result);
    }

    // R8 : H T T T -> Negative
    @Test
    void ruleR8_shouldReturnNegative() {
        String result = coinDecision.CoinDecision("H", "T", "T", "T");
        assertEquals("Negative", result);
    }

    // R11 : T H T H -> Positive
    @Test
    void ruleR11_shouldReturnPositive() {
        String result = coinDecision.CoinDecision("T", "H", "T", "H");
        assertEquals("Positive", result);
    }

    // R12 : T H T T -> Negative
    @Test
    void ruleR12_shouldReturnNegative() {
        String result = coinDecision.CoinDecision("T", "H", "T", "T");
        assertEquals("Negative", result);
    }

    // R13 : T T H H -> Positive
    @Test
    void ruleR13_shouldReturnPositive() {
        String result = coinDecision.CoinDecision("T", "T", "H", "H");
        assertEquals("Positive", result);
    }

    // R14 : T T H T -> Negative
    @Test
    void ruleR14_shouldReturnNegative() {
        String result = coinDecision.CoinDecision("T", "T", "H", "T");
        assertEquals("Negative", result);
    }

    // R7 : H T T H -> Positive
    @Test
    void ruleR7_shouldReturnPositive() {
        String result = coinDecision.CoinDecision("H", "T", "T", "H");
        assertEquals("Positive", result);
    }
}

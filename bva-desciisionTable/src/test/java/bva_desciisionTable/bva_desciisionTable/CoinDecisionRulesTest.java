package bva_desciisionTable.bva_desciisionTable;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CoinDecisionRulesTest {

    private final CoinDecision coinDecision = new CoinDecision();

    // R3: 3 H → Positive
    @Test
    void ruleR3_shouldReturnPositive() {
        String result = coinDecision.CoinDecision("H", "H", "T", "H");
        assertEquals("Positive", result);
    }

    // R5: 3 H → Positive
    @Test
    void ruleR5_shouldReturnPositive() {
        String result = coinDecision.CoinDecision("T", "H", "H", "H");
        assertEquals("Positive", result);
    }

    // R7: 2 H → Positive
    @Test
    void ruleR7_shouldReturnPositive() {
        String result = coinDecision.CoinDecision("H", "T", "T", "H");
        assertEquals("Positive", result);
    }

    // R12: 1 H → Negative
    @Test
    void ruleR12_shouldReturnNegative() {
        String result = coinDecision.CoinDecision("T", "T", "T", "H");
        assertEquals("Negative", result);
    }

    // R14: 1 H → Negative
    @Test
    void ruleR14_shouldReturnNegative() {
        String result = coinDecision.CoinDecision("T", "H", "T", "T");
        assertEquals("Negative", result);
    }
}

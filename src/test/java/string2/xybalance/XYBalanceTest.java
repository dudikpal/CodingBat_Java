package string2.xybalance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XYBalanceTest {

    @Test
    void test() {
        String input = "yaaxbb";

        assertFalse(new XYBalance().xyBalance(input));
    }

    @Test
    void test2() {
        String input = "xxxaaybb";

        assertTrue(new XYBalance().xyBalance(input));
    }

}
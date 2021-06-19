package logic2.roundsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundSumTest {

    @Test
    void test() {
        assertAll(
                () -> assertEquals(10, new RoundSum().roundSum(6, 4, 4)),
                () -> assertEquals(30, new RoundSum().roundSum(12, 13, 14)),
                () -> assertEquals(60, new RoundSum().roundSum(16, 17, 18))
        );
    }

}
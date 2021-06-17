package logic2.lonesum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoneSumTest {

    @Test
    void test() {
        int a = 3;
        int b = 2;
        int c = 3;
        int expected = 2;
        assertEquals(expected, new LoneSum().loneSum(a, b, c));
    }

}
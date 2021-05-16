package string2.counthi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountHiTest {

    @Test
    void test() {
        String input = "abchid hihh";
        int expected = 2;
        assertEquals(expected, new CountHi().countHi(input));
    }

}
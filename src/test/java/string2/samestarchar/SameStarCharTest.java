package string2.samestarchar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameStarCharTest {

    @Test
    void test() {
        String input = "*xy*zaz*z";
        boolean expected = false;
        assertEquals(expected, new SameStarChar().sameStarChar(input));
    }

    @Test
    void test2() {
        String input = "xy*zzz";
        boolean expected = false;
        assertEquals(expected, new SameStarChar().sameStarChar(input));
    }

    @Test
    void test3() {
        String input = "*xa*a*a";
        boolean expected = true;
        assertEquals(expected, new SameStarChar().sameStarChar(input));
    }

}
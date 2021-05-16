package string2.xyzmiddle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XYZMiddleTest {

    @Test
    void test() {
        String input = "AxyzBB";

        assertTrue(new XYZMiddle().xyzMiddle(input));
    }

    @Test
    void test2() {
        String input = "AAxyzBB";

        assertTrue(new XYZMiddle().xyzMiddle(input));
    }

    @Test
    void test3() {
        String input = "AxyzBBB";

        assertFalse(new XYZMiddle().xyzMiddle(input));
    }

    @Test
    void test4() {
        String input = "AAAxyzB";

        assertFalse(new XYZMiddle().xyzMiddle(input));
    }

    @Test
    void test5() {
        String input = "AAAxyzBB";

        assertTrue(new XYZMiddle().xyzMiddle(input));
    }

}
package string2.repeatfront;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatFrontTest {

    @Test
    void test() {
        String input = "Chocolate";
        String expected = "ChocChoChC";
        int repeat = 4;
        assertEquals(expected, new RepeatFront().repeatFront(input, 4));
    }

}
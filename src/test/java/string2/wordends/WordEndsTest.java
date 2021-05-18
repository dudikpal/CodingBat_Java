package string2.wordends;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordEndsTest {

    @Test
    void test() {
        String input = "abcXY123XYijk";
        String word = "XY";
        String expected = "c13i";
        assertEquals(expected, new WordEnds().wordEnds(input, word));
    }

    @Test
    void test2() {
        String input = "XY1XY";
        String word = "XY";
        String expected = "11";
        assertEquals(expected, new WordEnds().wordEnds(input, word));
    }

    @Test
    void test3() {
        String input = "abc1xyz11";
        String word = "1";
        String expected = "cxz11";
        assertEquals(expected, new WordEnds().wordEnds(input, word));
    }

    @Test
    void test4() {
        String input = "XYXY";
        String word = "XY";
        String expected = "XY";
        assertEquals(expected, new WordEnds().wordEnds(input, word));
    }

}
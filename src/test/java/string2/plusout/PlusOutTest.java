package string2.plusout;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOutTest {

    @Test
    void test() {
        String input = "12xy34xyabcxy";
        String input2 = "xy";
        String expected = "++xy++xy+++xy";
        assertEquals(expected, new PlusOut().plusOut(input, input2));
    }

    @Test
    void test2() {
        String input = "--++ab";
        String input2 = "++";
        String expected = "++++++";
        assertEquals(expected, new PlusOut().plusOut(input, input2));
    }

}
package string2.onetwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneTwoTest {

    @Test
    void test() {
        String input = "tcagdo";
        String expected = "catdog";
        assertEquals(expected, new OneTwo().oneTwo(input));
    }

}
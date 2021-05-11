package string2.doublechar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleCharTest {

    @Test
    void test() {
        String input = "Hi-there";
        String expected = "HHii--tthheerree";
        assertEquals(expected, new DoubleChar().doubleChar(input));
    }

}
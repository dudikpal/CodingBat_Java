package string2.mixstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MixStringTest {

    @Test
    void test() {
        String input1 = "abc";
        String input2 = "xyz";
        String expected = "axbycz";
        assertEquals(expected, new MixString().mixString(input1, input2));
    }

}
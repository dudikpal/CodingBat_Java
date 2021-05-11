package string2.countcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountCodeTest {

    @Test
    void test() {
        String input = "cozecopecode";
        int expected = 3;
        assertEquals(expected, new CountCode().countCode(input));
    }

}
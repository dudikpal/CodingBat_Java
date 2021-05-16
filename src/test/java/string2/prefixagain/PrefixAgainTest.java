package string2.prefixagain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrefixAgainTest {

    @Test
    void test() {
        String input = "abXYZabc";
        int prefix = 2;
        boolean expected = true;
        assertEquals(expected, new PrefixAgain().prefixAgain(input, prefix));
    }

}
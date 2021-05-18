package string2.xyzthere;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XYZThereTest {

    @Test
    void testFalse() {
        String input = "abc.xyz";
        assertFalse(new XYZThere().xyzThere(input));
    }

    @Test
    void testTrue() {
        String input = "abcxyzcb";
        assertTrue(new XYZThere().xyzThere(input));
    }

    @Test
    void testTrue2() {
        String input = "abc.xyzxyz";
        assertTrue(new XYZThere().xyzThere(input));
    }

}
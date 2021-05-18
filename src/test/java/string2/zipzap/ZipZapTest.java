package string2.zipzap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZipZapTest {

    @Test
    void test() {
        String input = "zipXzap";
        String expected = "zpXzp";
        assertEquals(expected, new ZipZap().zipZap(input));
    }

}
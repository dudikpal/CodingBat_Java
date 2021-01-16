package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Without2Test {

    @Test
    void without2() {
        String str = "HelloHe";

        assertEquals("lloHe", new Without2().without2(str));
    }
}
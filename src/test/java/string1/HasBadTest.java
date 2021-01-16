package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HasBadTest {

    @Test
    void hasBad() {
        String str = "xbadxx";

        assertTrue(new HasBad().hasBad(str));
    }
}
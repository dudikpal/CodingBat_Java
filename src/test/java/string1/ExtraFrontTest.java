package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtraFrontTest {

    @Test
    void extraFront() {
        String str = "Hello";

        assertEquals("HeHeHe", new ExtraFront().extraFront(str));
    }
}
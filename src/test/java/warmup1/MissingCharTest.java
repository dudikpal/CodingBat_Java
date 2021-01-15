package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingCharTest {

    @Test
    void missingChar() {
        MissingChar mc = new MissingChar();

        String str = "Test string.";

        assertEquals("Test strng.", mc.missingChar(str, 8));
    }
}
package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonStartTest {

    @Test
    void nonStart() {
        String a = "Tázó";
        String b = "szacsy";

        assertEquals("ázózacsy", new NonStart().nonStart(a, b));
    }
}
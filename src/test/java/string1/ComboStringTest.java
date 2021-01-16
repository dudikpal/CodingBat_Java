package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComboStringTest {

    @Test
    void comboString() {
        String a = "abba";
        String b = "bambab";

        assertEquals("abbabambababba", new ComboString().comboString(a, b));
    }
}
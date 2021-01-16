package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastCharsTest {

    @Test
    void lastChars() {
        String a = "yo";
        String b = "java";

        assertEquals("ya", new LastChars().lastChars(a, b));
    }
}
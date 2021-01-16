package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConCatTest {

    @Test
    void conCat() {
        String a = "abc";
        String b = "cat";

        assertEquals("abcat", new ConCat().conCat(a, b));
    }
}
package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutEndTest {

    @Test
    void withoutEnd() {
        String str = "Hello";

        assertEquals("ell", new WithoutEnd().withoutEnd(str));
    }
}
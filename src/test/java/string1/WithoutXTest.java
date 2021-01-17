package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutXTest {

    @Test
    void withoutX() {
        String str = "xaxbx";

        assertEquals("axb", new WithoutX().withoutX(str));
    }
}
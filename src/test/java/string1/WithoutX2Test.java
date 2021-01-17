package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutX2Test {

    @Test
    void withoutX2() {
        String str = "xx";

        assertEquals("", new Without2().without2(str));
    }
}
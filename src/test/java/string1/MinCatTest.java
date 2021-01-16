package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCatTest {

    @Test
    void minCat() {
        String a = "java";
        String b = "Hello";

        assertEquals("javaello", new MinCat().minCat(a, b));
    }
}
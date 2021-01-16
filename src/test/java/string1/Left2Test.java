package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Left2Test {

    @Test
    void left2() {
        String str = "Hellóka";

        assertEquals("llókaHe", new Left2().left2(str));
    }
}
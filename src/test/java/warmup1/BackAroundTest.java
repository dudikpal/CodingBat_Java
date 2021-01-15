package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackAroundTest {

    @Test
    void backAround() {
        BackAround ba = new BackAround();

        String str = "Test string";

        assertEquals("gTest stringg", ba.backAround(str));
    }
}
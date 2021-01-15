package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Front22Test {

    @Test
    void front22() {
        Front22 front22 = new Front22();

        String str = "Test string";

        assertEquals("TeTest stringTe", front22.front22(str));
    }
}
package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringETest {

    @Test
    void stringE() {
        StringE stringE = new StringE();

        String str = "Heelele";

        assertFalse(stringE.stringE(str));
    }
}
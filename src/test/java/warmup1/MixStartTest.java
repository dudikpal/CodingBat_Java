package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MixStartTest {

    @Test
    void mixStart() {

        MixStart ms = new MixStart();

        String str = "Tixt string";

        assertTrue(ms.mixStart(str));
    }
}
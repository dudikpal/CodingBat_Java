package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Close10Test {

    @Test
    void close10() {
        Close10 close10 = new Close10();

        int a = 13;
        int b = 3;

        assertEquals(13, close10.close10(a, b));
    }
}
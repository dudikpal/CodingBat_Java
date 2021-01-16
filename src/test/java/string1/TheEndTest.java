package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheEndTest {

    @Test
    void theEnd() {
        String str = "Hellóka";
        boolean front = false;

        assertEquals("a", new TheEnd().theEnd(str, front));
    }
}
package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtFirstTest {

    @Test
    void atFirst() {
        String str = "h";

        assertEquals("h@", new AtFirst().atFirst(str));
    }
}
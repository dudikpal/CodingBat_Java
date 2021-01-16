package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtraEndTest {

    @Test
    void extraEnd() {
        String word = "Candy";

        assertEquals("dydydy", new ExtraEnd().extraEnd(word));
    }
}
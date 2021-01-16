package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeeColorTest {

    @Test
    void seeColor() {
        String str = "blueTimes";

        assertEquals("blue", new SeeColor().seeColor(str));
    }
}
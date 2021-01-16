package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Right2Test {

    @Test
    void right2() {
        String str = "Hellóka";

        assertEquals("kaHelló", new Right2().right2(str));
    }

}
package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutEnd2Test {

    @Test
    void withouEnd2() {
        String str = "Hellóka";

        assertEquals("ellók", new WithoutEnd2().withouEnd2(str));
    }
}
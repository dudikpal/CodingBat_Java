package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EveryNthTest {

    @Test
    void everyNth() {
        EveryNth everyNth = new EveryNth();

        String str = "Test string";
        int number = 3;

        assertEquals("Tttn", everyNth.everyNth(str, number));
    }
}
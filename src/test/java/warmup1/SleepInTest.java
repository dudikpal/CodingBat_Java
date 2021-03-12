package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SleepInTest {
    
    @Test
    void sleepIn() {
        assertTrue(new SleepIn().sleepIn(false, true));
    }
}
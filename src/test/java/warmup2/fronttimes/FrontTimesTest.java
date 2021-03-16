package warmup2.fronttimes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrontTimesTest {
    
    @Test
    void frontTimes() {
        
        assertEquals("ChoChoCho", new FrontTimes().frontTimes("Chocolade", 3));
        
    }
}
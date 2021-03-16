package warmup2;

import org.junit.jupiter.api.Test;
import warmup2.stringtimes.StringTimes;

import static org.junit.jupiter.api.Assertions.*;

class StringTimesTest {
    
    @Test
    void stringTimes() {
        
        assertEquals("HiHiHi", new StringTimes().stringTimes("Hi", 3));
        
    }
    
}
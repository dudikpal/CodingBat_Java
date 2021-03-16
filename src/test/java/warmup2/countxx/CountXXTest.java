package warmup2.countxx;

import org.junit.jupiter.api.Test;
import recursion.CountHi;

import static org.junit.jupiter.api.Assertions.*;

class CountXXTest {
    
    @Test
    void countXX() {
        
        assertEquals(3, new CountXX().countXX("xxxx"));
        
    }
}
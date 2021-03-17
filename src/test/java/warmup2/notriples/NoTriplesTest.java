package warmup2.notriples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoTriplesTest {
    
    @Test
    void noTriples() {
        
        assertTrue(new NoTriples().noTriples(new int[]{1, 1, 2, 2, 3}));
        
    }
}
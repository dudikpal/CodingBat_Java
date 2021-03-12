package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    
    @Test
    void fibonacci() {
        
        assertEquals(21, new Fibonacci().fibonacci(8));
        
    }
}
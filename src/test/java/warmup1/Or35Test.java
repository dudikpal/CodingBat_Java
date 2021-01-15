package warmup1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Or35Test {

    @Test
    void or35() {
        Or35 or35 = new Or35();

        int number = 30;

        assertTrue(or35.or35(number));
    }
}
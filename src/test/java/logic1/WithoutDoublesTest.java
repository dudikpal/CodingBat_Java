package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutDoublesTest {

    @Test
    void withoutDoubles() {
        int die1 = 6;
        int die2 = 6;
        boolean noDoubles = true;

        assertEquals(7, new WithoutDoubles().withoutDoubles(die1, die2, noDoubles));
    }
}
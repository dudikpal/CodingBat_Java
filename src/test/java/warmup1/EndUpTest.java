package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndUpTest {

    @Test
    void endUp() {
        EndUp endUp = new EndUp();

        String str = "Hello there";

        assertEquals("Hello thERE", endUp.endUp(str));
    }
}
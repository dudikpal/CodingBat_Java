package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IoneTeenTest {

    @Test
    void testCreate() {
        IoneTeen ioneTeen = new IoneTeen();

        int a = 14;
        int b = 18;

        assertFalse(ioneTeen.loneTeen(a, b));
    }

}
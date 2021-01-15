package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StartHiTest {

    @Test
    void startHi() {
        StartHi sh = new StartHi();

        String str = "hi Test string";

        assertTrue(sh.startHi(str));
    }
}
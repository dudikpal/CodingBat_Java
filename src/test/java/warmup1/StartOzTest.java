package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StartOzTest {

    @Test
    void startOz() {
        StartOz so = new StartOz();

        String str = "ozTest string";

        assertEquals("oz", so.startOz(str));
    }
}
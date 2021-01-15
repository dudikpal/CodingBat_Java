package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Front3Test {

    @Test
    void front3() {
        Front3 front3 = new Front3();

        String str = "Test string";

        assertEquals("TesTesTes", front3.front3(str));
    }
}
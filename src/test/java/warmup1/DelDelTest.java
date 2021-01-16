package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DelDelTest {

    @Test
    void delDel() {
        DelDel delDel = new DelDel();

        String str = "adelbc";

        assertEquals("abc", delDel.delDel(str));
    }
}
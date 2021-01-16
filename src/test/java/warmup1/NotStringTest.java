package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotStringTest {

    @Test
    void notString() {
        NotString notString = new NotString();

        String str = "no";

        assertEquals("not no", notString.notString(str));
    }
}
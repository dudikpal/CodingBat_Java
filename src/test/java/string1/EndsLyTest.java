package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndsLyTest {

    @Test
    void endsLy() {
        String str = "oddly";

        assertTrue(new EndsLy().endsLy(str));
    }
}
package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NearHundredTest {

    @Test
    void nearHundred() {
        NearHundred nearHundred = new NearHundred();

        int number = 89;

        assertFalse(nearHundred.nearHundred(number));
    }
}
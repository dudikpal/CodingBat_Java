package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonkeyTroubleTest {

    @Test
    void monkeyTrouble() {
        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();

        boolean aSmile = false;
        boolean bSmile = false;

        assertTrue(monkeyTrouble.monkeyTrouble(aSmile, bSmile));
    }
}
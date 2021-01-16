package warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParrotTroubleTest {

    @Test
    void parrotTrouble() {
        ParrotTrouble parrotTrouble = new ParrotTrouble();

        boolean talk = false;
        int hour = 6;

        assertFalse(parrotTrouble.parrotTrouble(talk, hour));
    }
}
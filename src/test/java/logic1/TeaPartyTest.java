package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeaPartyTest {

    @Test
    void teaParty() {
        int tea = 6;
        int candy = 8;

        assertEquals(1, new TeaParty().teaParty(tea, candy));
    }
}
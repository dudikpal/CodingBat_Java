package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CigarPartyTest {

    @Test
    void cigarParty() {
        int cigars = 70;
        boolean isWeekend = true;

        assertTrue(new CigarParty().cigarParty(cigars, isWeekend));
    }
}
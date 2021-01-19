package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RedTicketTest {

    @Test
    void redTicket() {
        int a = 3;
        int b = 5;
        int c = 6;

        assertEquals(1, new RedTicket().redTicket(a, b, c));
    }
}
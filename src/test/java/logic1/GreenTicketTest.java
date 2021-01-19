package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreenTicketTest {

    @Test
    void greenTicket() {
        int a = 1;
        int b = 2;
        int c = 2;

        assertEquals(10, new GreenTicket().greenTicket(a, b, c));
    }
}
package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlueTicketTest {

    @Test
    void blueTicket() {
        int a = 15;
        int b = 4;
        int c = 5;

        assertEquals(5, new BlueTicket().blueTicket(a, b, c));
    }
}
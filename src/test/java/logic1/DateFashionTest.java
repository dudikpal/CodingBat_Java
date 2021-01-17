package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateFashionTest {

    @Test
    void dateFashion() {
        int you = 8;
        int date = 2;

        assertEquals(0, new DateFashion().dateFashion(you, date));
    }
}
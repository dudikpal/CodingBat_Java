package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmClockTest {

    @Test
    void alarmClock() {
        int day = 0;
        boolean vacation = true;

        assertEquals("off", new AlarmClock().alarmClock(day, vacation));
    }
}
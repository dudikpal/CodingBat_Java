package logic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnswerCellTest {

    @Test
    void answerCell() {
        boolean isMorning = false;
        boolean isMom = false;
        boolean isAsleep = false;

        assertTrue(new AnswerCell().answerCell(isMorning, isMom, isAsleep));
    }
}
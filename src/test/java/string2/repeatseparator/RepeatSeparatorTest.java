package string2.repeatseparator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatSeparatorTest {

    @Test
    void test() {
        String inputWord = "word";
        String inputSep = "X";
        int repeat = 3;
        String expected = "wordXwordXword";
        assertEquals(expected, new RepeatSeparator().repeatSeparator(inputWord, inputSep, repeat));
    }

}
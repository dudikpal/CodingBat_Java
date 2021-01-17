package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StartWordTest {

    @Test
    void startWord() {
        String str = "hippo";
        String word = "xip";

        assertEquals("hip", new StartWord().startWord(str, word));
    }
}
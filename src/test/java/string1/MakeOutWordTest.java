package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeOutWordTest {

    @Test
    void makeOutWord() {
        String out = "{<[<>]>}";
        String word = "middle";

        assertEquals("{<[<middle>]>}", new MakeOutWord().makeOutWord(out, word));
    }
}
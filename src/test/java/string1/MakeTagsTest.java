package string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeTagsTest {

    @Test
    void makeTags() {
        String tag = "b";
        String word = "word";

        assertEquals("<b>word</b>", new MakeTags().makeTags(tag, word));
    }
}
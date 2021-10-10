package ap1.words_without;

import java.util.Arrays;

public class WordsWithout {

    public String[] wordsWithout(String[] words, String target) {

        return Arrays.stream(words)
                .filter(word -> !word.equals(target))
                .toArray(String[]::new);
    }

}

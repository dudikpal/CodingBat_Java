package ap1.wordscount;

import java.util.Arrays;

public class WordsCount {

    public int wordsCount(String[] words, int len) {

        return (int)Arrays.stream(words)
                .filter(word -> word.length() == len)
                .count();
    }

}

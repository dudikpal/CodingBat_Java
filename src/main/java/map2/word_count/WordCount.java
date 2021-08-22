package map2.word_count;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {

    public Map<String, Integer> wordCount(String[] strings) {

        Map<String, Integer> result = new HashMap<>();
        for (String word : strings) {
            result.merge(word, 1, Integer::sum);
        }

        return result;
    }

}

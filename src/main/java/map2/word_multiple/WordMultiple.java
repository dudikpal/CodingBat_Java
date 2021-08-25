package map2.word_multiple;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordMultiple {

    public Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Integer> result = new HashMap<>();
        for (String word : strings) {
            result.merge(word, 1, Integer::sum);
        }

        Map<String, Boolean> result2 = new HashMap<>();
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            result2.put(entry.getKey(), entry.getValue() > 1 ? true : false);
        }
        return result2;
    }

}

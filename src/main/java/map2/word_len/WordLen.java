package map2.word_len;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordLen {

    public Map<String, Integer> wordLen(String[] strings) {

        return Arrays.stream(strings)
                .collect(Collectors.toMap(String::new, String::length, (l1, l2) -> l1));
    }

}

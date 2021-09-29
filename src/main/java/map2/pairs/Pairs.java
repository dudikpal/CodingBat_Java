package map2.pairs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Pairs {

    public Map<String, String> pairs(String[] strings) {

        Map<String, String> result = new HashMap<>();
        /*return Arrays.stream(strings)
                .map(str -> List.of(str.substring(0, 1), str.substring(str.length() - 2)))
                .collect(Collectors.toMap(
                        str -> str.get(0),
                        str -> str.get(1)
                ));*/
        for (String word : strings) {
            result.put(word.substring(0, 1), word.substring(word.length() - 1));
        }
        return result;
    }

}

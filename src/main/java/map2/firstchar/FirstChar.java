package map2.firstchar;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class FirstChar {

    public Map<String, String> firstChar(String[] strings) {

        //Map<String, String> result = new HashMap<>();
        /*for (String word : strings) {
            result.merge(word.substring(0, 1), word, String::concat);
        }*/

        /*Arrays.stream(strings)
                .forEach(word -> result.merge(word.substring(0, 1), word, String::concat));
        return result;*/

        return Arrays.stream(strings)
                .collect(
                        Collectors.toMap(word -> word.substring(0, 1),
                                Function.identity(),
                                String::concat)
                );
    }

}

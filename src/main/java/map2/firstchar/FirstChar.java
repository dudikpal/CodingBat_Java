package map2.firstchar;


import java.util.HashMap;
import java.util.Map;


public class FirstChar {

    public Map<String, String> firstChar(String[] strings) {

        Map<String, String> result = new HashMap<>();
        for (String word : strings) {
            result.merge(word.substring(0, 1), word, (prev, next) -> prev + next);
        }
        return result;
    }

}

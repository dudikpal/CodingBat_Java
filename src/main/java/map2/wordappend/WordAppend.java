package map2.wordappend;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {

    public String wordAppend(String[] strings) {

        Map<String, Integer> letterAppearCount = new HashMap<>();
        String result = "";
        for (String letter : strings) {
            letterAppearCount.merge(letter, 1, Integer::sum);
            if (letterAppearCount.get(letter) %2 == 0) {
                result += (letter);
            }
        }
        return result;
    }
}

package map2.firstswap;

import java.util.ArrayList;
import java.util.List;

public class FirstSwap {

    public String[] firstSwap(String[] strings) {

        List<Character> ignoredFirstChar = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            char firstChar = strings[i].charAt(0);
            for (int j = i + 1; j < strings.length; j++) {
                if (firstChar == strings[j].charAt(0)
                        && !ignoredFirstChar.contains(firstChar)) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                    ignoredFirstChar.add(firstChar);
                }
            }
        }
        return strings;
    }

}

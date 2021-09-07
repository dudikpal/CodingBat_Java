package map2.allswap;

import java.util.HashSet;
import java.util.Set;

public class AllSwap {

    public String[] allSwap(String[] strings) {

        Set<Integer> indexes = new HashSet<>();

        for (int i = 0; i < strings.length; i++) {
            if (!indexes.contains(i)) {
                for (int j = i + 1; j < strings.length; j++) {
                    if (strings[i].charAt(0) == strings[j].charAt(0)) {
                        indexes.add(i);
                        indexes.add(j);
                        String temp = strings[j];
                        strings[j] = strings[i];
                        strings[i] = temp;
                        break;
                    }
                }
            }
        }
        return strings;
    }

}

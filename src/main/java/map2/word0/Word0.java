package map2.word0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Word0 {

    public Map<String, Integer> word0(String[] strings) {

        return IntStream.range(0, strings.length)
                .boxed()
                .collect(Collectors.toMap(i -> strings[i], value -> 0, Integer::sum));
    }
}

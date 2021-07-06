package functional2.nolong;

import java.util.List;
import java.util.stream.Collectors;

public class NoLong {

    public List<String> noLong(List<String> strings) {

        return strings.stream()
                .filter(str -> str.length() < 4)
                .collect(Collectors.toList());
    }

}

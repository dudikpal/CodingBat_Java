package functional2.noyy;

import java.util.List;
import java.util.stream.Collectors;

public class NoYY {

    public List<String> noYY(List<String> strings) {

        return strings.stream()
                .filter(str -> !str.endsWith("y"))
                .filter(str -> !str.contains("yy"))
                .map(str -> str.concat("y"))
                .collect(Collectors.toList());
    }
}

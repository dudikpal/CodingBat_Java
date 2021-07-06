package functional2.noz;

import java.util.List;
import java.util.stream.Collectors;

public class NoZ {

    public List<String> noZ(List<String> strings) {

        return strings.stream()
                .filter(str -> !str.contains("z"))
                .collect(Collectors.toList());
    }

}

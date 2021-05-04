package functional1.lower;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Lower {

    public List<String> lower(List<String> strings) {

        return strings.stream()
                .map(x -> x.toLowerCase())
                .collect(Collectors.toList());
    }

}

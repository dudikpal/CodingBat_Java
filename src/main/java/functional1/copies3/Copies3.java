package functional1.copies3;

import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {

    public List<String> copies3(List<String> strings) {
        //strings.replaceAll(x -> x.repeat(3));
        return strings.stream()
                .map(x -> x + x + x)
                .collect(Collectors.toList());
        //return strings;
    }

}

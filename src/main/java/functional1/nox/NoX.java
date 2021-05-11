package functional1.nox;

import java.util.List;

public class NoX {

    public List<String> noX(List<String> strings) {

        strings.replaceAll(x -> x.replace("x", ""));
        return strings;
    }

}

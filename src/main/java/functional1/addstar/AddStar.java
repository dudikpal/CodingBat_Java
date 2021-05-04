package functional1.addstar;

import java.util.List;

public class AddStar {

    public List<String> addStar(List<String> strings) {

        strings.replaceAll(x -> x + "*");
        return strings;
    }

}

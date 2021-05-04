package functional1.morey;

import java.util.List;

public class MoreY {

    public List<String> moreY(List<String> strings) {

        strings.replaceAll(x -> "y" + x + "y");
        return strings;
    }

}

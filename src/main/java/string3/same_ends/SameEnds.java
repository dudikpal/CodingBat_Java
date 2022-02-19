package string3.same_ends;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SameEnds {

    public String sameEnds(String string) {

        if (string.length() < 2) {
            return "";
        }

        Pattern p = Pattern.compile("^(\\w+).*(\\1)$");
        Matcher m = p.matcher(string);

        if (!m.find()) {
            return "";
        }

        return m.group(1);
    }

}

package string2.bobthere;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BobThere {

    public boolean bobThere(String str) {

        /*Pattern p = Pattern.compile("(?=(b.b))");
        Matcher m = p.matcher(str);*/
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' &&
                str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }
}

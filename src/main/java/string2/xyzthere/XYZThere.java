package string2.xyzthere;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XYZThere {

    public boolean xyzThere(String str) {

        /*Pattern p = Pattern.compile("^[^.]*xyz");
        Matcher m = p.matcher(str);
        return m.find();*/
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == '.') {
                i++;
                continue;
            }
            if (str.substring(i).startsWith("xyz")) {
                return true;
            }
        }
        return false;
    }

}

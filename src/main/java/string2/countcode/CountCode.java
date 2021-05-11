package string2.countcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountCode {

    public int countCode(String str) {

        /*Pattern p = Pattern.compile("(?=(co.e))");
        Matcher m = p.matcher(str);
        int counter = 0;
        while (m.find()) {
            counter++;
        }
        return  counter;*/
        int counter = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c'
                    && str.charAt(i + 1) == 'o'
                    && str.charAt(i + 3) == 'e') {
                counter++;
            }
        }
        return counter;
    }

}

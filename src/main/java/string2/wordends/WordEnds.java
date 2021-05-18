package string2.wordends;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordEnds {

    public String wordEnds(String str, String word) {

        if (str.length() == word.length()) {
            return "";
        }
        Pattern p = Pattern.compile(word);
        Matcher m = p.matcher(str);
        String result = "";
        while (m.find()) {
            System.out.print("Start index: " + m.start());
            System.out.print(" End index: " + m.end());
            System.out.println(" Found: " + m.group());
            if (m.start() > 0) {
                result = result + str.charAt(m.start() - 1);
            }
            if (m.end() <= str.length() - word.length()) {
                result = result + str.charAt(m.end());
            }
        }

        return result;
    }

}

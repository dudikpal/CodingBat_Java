package string3.ghappy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class GHappy {


    public boolean gHappy(String str) {

        Pattern p = Pattern.compile("(?<!g)g(?!g)");
        Matcher matcher = p.matcher(str);

        return !matcher.find();
    }

}

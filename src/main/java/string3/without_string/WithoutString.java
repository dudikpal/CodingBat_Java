package string3.without_string;

import java.util.regex.Pattern;

public class WithoutString {

    public String withoutString(String base, String remove) {

        return base.replaceAll("(?i)" + remove, "");


    }

}

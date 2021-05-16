package string2.starout;

import java.util.Arrays;

public class StarOut {

    public String starOut(String str) {

        String[] validString = str.split(".?\\*+.?");
        //System.out.println(Arrays.toString(validString));
        StringBuilder sb = new StringBuilder();
        for (String letters : validString) {
            sb.append(letters);
        }
        return sb.toString();
    }

}

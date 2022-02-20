package string3.sum_numbers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumNumbers {

    public int sumNumbers(String str) {

        Pattern p = Pattern.compile("(\\d+)");
        Matcher m = p.matcher(str);

        int sum = 0;

        while (m.find()) {
            sum += Integer.parseInt(m.group());
        }

        return sum;
    }

}

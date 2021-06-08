package array2.twotwo;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TwoTwo {

    public boolean twoTwo(int[] nums) {

        Pattern p = Pattern.compile("(^2, [^2])|([^2], 2$)|([^2], 2, [^2])");

        if (nums.length == 1 && nums[0] == 2) {
            return false;
        }
        String list = Arrays.stream(nums)
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toList())
                .toString()
                .replace("[", "")
                .replace("]", "");

        Matcher m = p.matcher(list);
        return !m.find();
    }

}

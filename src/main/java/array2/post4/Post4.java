package array2.post4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Post4 {

    public int[] post4(int[] nums) {

        int lastIndex4 = Arrays.stream(nums)
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toList())
                .lastIndexOf(4);

        int[] result = Arrays.stream(nums)
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toList())
                .subList(lastIndex4 + 1, nums.length)
                .stream()
                .mapToInt(i -> i)
                .toArray();

        return result;
    }

}

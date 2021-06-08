package array2.more14;

import java.util.Arrays;

public class More14 {

    public boolean more14(int[] nums) {

        long _1s = Arrays.stream(nums)
                .filter(x -> x == 1)
                .count();
        long _4s = Arrays.stream(nums)
                .filter(x -> x == 4)
                .count();
        return _1s > _4s;
    }

}

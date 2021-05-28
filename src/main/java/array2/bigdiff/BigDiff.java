package array2.bigdiff;

import java.util.Arrays;
import java.util.Comparator;

public class BigDiff {

    public int bigDiff(int[] nums) {

        int min = Arrays.stream(nums)
                .mapToObj(Integer::valueOf)
                .min(Comparator.naturalOrder())
                .get();

        int max = Arrays.stream(nums)
                .mapToObj(Integer::valueOf)
                .max(Comparator.naturalOrder())
                .get();
        return max - min;
    }

}

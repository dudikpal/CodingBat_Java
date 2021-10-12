package ap1.copy_evens;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CopyEvens {

    public int[] copyEvens(int[] nums, int count) {

        return Arrays.stream(nums)
                .filter(num -> num % 2 == 0)
                .limit(count)
                .toArray();
    }

}

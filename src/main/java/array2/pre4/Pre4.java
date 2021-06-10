package array2.pre4;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pre4 {

    public int[] pre4(int[] nums) {

        int indexOf4 = Arrays.stream(nums)
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toList())
                .indexOf(4);
        return Arrays.copyOfRange(nums, 0, indexOf4);
    }

}

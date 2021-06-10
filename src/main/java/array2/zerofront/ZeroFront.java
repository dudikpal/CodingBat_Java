package array2.zerofront;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ZeroFront {

    public int[] zeroFront(int[] nums) {

        int[] nonZeros = Arrays.stream(nums)
                .filter(x -> x != 0)
                .toArray();
        int[] result = new int[nums.length - nonZeros.length];
        return IntStream.concat(IntStream.of(result), IntStream.of(nonZeros))
                .toArray();
    }

}

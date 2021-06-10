package array2.evenodd;

import java.util.Arrays;
import java.util.stream.IntStream;

public class EvenOdd {

    public int[] evenOdd(int[] nums) {

        int[] evens = Arrays.stream(nums)
                .filter(x -> x % 2 == 0)
                .toArray();
        int[] odds = Arrays.stream(nums)
                .filter(x -> x % 2 == 1)
                .toArray();
        return IntStream.concat(IntStream.of(evens), IntStream.of(odds))
                .toArray();
    }

}

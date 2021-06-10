package array2.fizzarray3;

import java.util.stream.IntStream;

public class FizzArray3 {

    public int[] fizzArray3(int start, int end) {

        return IntStream.range(start, end).toArray();
    }

}

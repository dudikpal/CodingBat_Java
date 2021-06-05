package array2.centeredaverage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class CenteredAverage {

    public int centeredAverage(int[] nums) {

        return (int)Arrays.stream(Arrays.stream(nums)
                .mapToObj(Integer::valueOf)
                .sorted()
                .collect(Collectors.toList())
                .subList(1, nums.length - 1)
                .stream()
                .mapToInt(x -> x)
                .toArray())
                .average()
                .getAsDouble();

    }

}

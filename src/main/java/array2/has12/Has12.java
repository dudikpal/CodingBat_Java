package array2.has12;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Has12 {

    public boolean has12(int[] nums) {

        int firstIndex1 = Arrays.stream(nums)
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toList())
                .indexOf(1);
        int lastIndex2 = Arrays.stream(nums)
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toList())
                .lastIndexOf(2);
        return firstIndex1 != -1 && lastIndex2 != -1 && firstIndex1 < lastIndex2;
    }

}

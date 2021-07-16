package functional2.two2;

import java.util.List;
import java.util.stream.Collectors;

public class Two2 {

    public List<Integer> two2(List<Integer> nums) {

        return nums.stream()
                .map(num -> num * 2)
                .filter(num -> num % 10 != 2)
                .collect(Collectors.toList());

    }

}

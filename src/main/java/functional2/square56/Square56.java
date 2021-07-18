package functional2.square56;

import java.util.List;
import java.util.stream.Collectors;

public class Square56 {

    public List<Integer> square56(List<Integer> nums) {

        return  nums.stream()
                .map(num -> num * num + 10)
                .filter(num -> num % 10 != 5 && num % 10 != 6)
                .collect(Collectors.toList());
    }

}

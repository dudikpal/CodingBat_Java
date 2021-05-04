package functional1.math1;

import java.util.List;

public class Math1 {

    public List<Integer> math1(List<Integer> nums) {

        nums.replaceAll(x -> (x + 1) * 10);
        return nums;
    }

}

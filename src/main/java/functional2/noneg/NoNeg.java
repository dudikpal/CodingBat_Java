package functional2.noneg;

import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {

    public List<Integer> noNeg(List<Integer> nums) {

        return nums.stream()
                .filter(num -> num > -1)
                .collect(Collectors.toList());
    }

}

/*
public List<Integer> noNeg(List<Integer> nums) {
  nums.removeIf(n -> n < 0);
  return nums;

  // OR the equivalent stream solution
  // Note that the boolean logic is opposite
  // return nums.stream()
  //   .filter(n -> n >= 0)
  //   .collect(Collectors.toList());
}
 */

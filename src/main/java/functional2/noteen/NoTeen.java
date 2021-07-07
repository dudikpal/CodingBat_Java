package functional2.noteen;

import com.sun.source.tree.UsesTree;

import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {

    public List<Integer> noTeen(List<Integer> nums) {

        return nums.stream()
                .filter(num -> num < 13 || num > 19)
                .collect(Collectors.toList());
    }

}

/*
public List<Integer> noTeen(List<Integer> nums) {
  nums.removeIf(n -> n >= 13 && n <= 19);
  return nums;
}
 */
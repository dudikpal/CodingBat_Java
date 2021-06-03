package array2.zeromax;

import java.util.Arrays;

public class ZeroMax {

    public int[] zeroMax(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                int[] subArray = Arrays.copyOfRange(nums, i, nums.length);
                subArray = Arrays.stream(subArray).sorted().toArray();
                for (int j = subArray.length - 1; j > 0 ; j--) {
                    if (subArray[j] % 2 == 1) {
                        nums[i] = subArray[j];
                        break;
                    }
                }
            }
        }
        return nums;
    }

}

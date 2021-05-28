package array2.sameends;

public class SameEnds {

    public boolean sameEnds(int[] nums, int len) {

        int validator = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == nums[nums.length - len + i]) {
                validator++;
            }
        }
        return validator == len;
    }

}

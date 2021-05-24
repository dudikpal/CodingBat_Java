package array2.no14;

public class No14 {

    public boolean no14(int[] nums) {

        boolean is4 = false;
        boolean is1 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                is1 = true;
            }
            if (nums[i] == 4) {
                is4 = true;
            }
        }
        return (is1 ^ is4) || (!is1 && !is4);
    }
}

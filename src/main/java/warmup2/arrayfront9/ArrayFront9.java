package warmup2.arrayfront9;

public class ArrayFront9 {
    
    public boolean arrayFront9(int[] nums) {
    
        int length = nums.length;
        if (nums.length > 4) {
            length = 4;
        }
        for (int i = 0; i < length; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }
}

package warmup2.has271;

public class Has271 {
    
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int base = nums[i];
            if (base + 5 == nums[i + 1] && nums[i + 2] >= base - 3 && nums[i + 2] <= base + 1 ) {
                return true;
            }
        }
        return false;
    }
}

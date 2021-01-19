/*
Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
 */
package array1;

public class MaxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int larger = nums[0];
        if (larger < nums[nums.length - 1]) {
            larger = nums[nums.length - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = larger;
        }
        return nums;
    }
}

/*
public int[] maxEnd3(int[] nums) {
  int max = Math.max(nums[0], nums[2]);
  nums[0] = max;
  nums[1] = max;
  nums[2] = max;
  return nums;
 */
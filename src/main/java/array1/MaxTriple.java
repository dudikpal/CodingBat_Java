/*
Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.

maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
 */
package array1;

public class MaxTriple {
    public int maxTriple(int[] nums) {
        int max = nums[0];
        if (nums[nums.length / 2] > max) {
            max = nums[nums.length / 2];
        }
        if (nums[nums.length - 1] > max) {
            max = nums[nums.length - 1];
        }
        return max;
    }
}

/*
Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.

maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
 */
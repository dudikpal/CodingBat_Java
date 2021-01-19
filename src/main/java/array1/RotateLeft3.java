/*
Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
 */
package array1;

public class RotateLeft3 {
    public int[] rotateLeft3(int[] nums) {
        int[] rotatedNums = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            rotatedNums[i - 1] = nums[i];
        }
        rotatedNums[rotatedNums.length - 1] = nums[0];
        return rotatedNums;
    }
}

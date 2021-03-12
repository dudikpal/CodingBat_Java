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
        
        if (nums.length - 1 >= 0) {
            System.arraycopy(nums, 1, rotatedNums, 0, nums.length - 1);
        }
        
        rotatedNums[rotatedNums.length - 1] = nums[0];
        return rotatedNums;
    }
}


/*
Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]

 */
/*
Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.

make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
 */
package array1;

import java.util.List;

public class Make2 {
    public int[] make2(int[] a, int[] b) {
        int[] sumArrays = new int[a.length + b.length];
        int index = 0;
        for (int number :a ) {
          sumArrays[index] = number;
          index++;
        }
        for (int number :b ) {
          sumArrays[index] = number;
          index++;
        }
        return new int[]{sumArrays[0], sumArrays[1]};
    }
}


/*
Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.

make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
 */
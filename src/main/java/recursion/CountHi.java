package recursion;

public class CountHi {
    
    public int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.startsWith("hi")) {
            return 1 + countHi(str.substring(2));
        }
        return countHi(str.substring(1));
    }
}

/*
Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1 */

/*
Our Solution:

public int countHi(String str) {
  if (str.length() <= 1) return 0;
  int count = 0;
  if (str.substring(0, 2).equals("hi")) count = 1;  // could use startsWith()
  return count + countHi(str.substring(1));
}
 */
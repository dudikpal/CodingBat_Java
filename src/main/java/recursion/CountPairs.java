package recursion;

public class CountPairs {
    
    public int countPairs(String str) {
    
        if (str.length() < 3) {
            return 0;
        }
        int counter = 0;
        if (str.charAt(0) == str.charAt(2)) {
            counter = 1;
        }
        return counter + countPairs(str.substring(1));
    }
}


/*
We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.

countPairs("axa") → 1
countPairs("axax") → 2
countPairs("axbx") → 1
 */
package recursion;

public class CountHi2 {
    
    public int countHi2(String str) {
    
        if (str.length() < 2) {
            return 0;
        }
        if (str.startsWith("hi")) {
            return 1 + countHi2(str.substring(2));
        }
        if (str.charAt(0) == 'x' && str.substring(1).startsWith("hi")) {
            return countHi2(str.substring(3));
        }
        return countHi2(str.substring(1));
    }
}

/*
Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.

countHi2("ahixhi") → 1
countHi2("ahibhi") → 2
countHi2("xhixhi") → 0
 */
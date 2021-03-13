package recursion;

public class NoX {
    
    public String noX(String str) {
    
        if (str.length() == 0) {
            return str;
        }
        String startLetter = str.substring(0, 1);
        if (str.startsWith("x")) {
             return noX(str.substring(1));
        }
        return startLetter + noX(str.substring(1));
    }
}

/*
Given a string, compute recursively a new string where all the 'x' chars have been removed.

noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""
 */
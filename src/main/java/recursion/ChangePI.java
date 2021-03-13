package recursion;

public class ChangePI {
    
    public String changePi(String str) {
    
        if (str.length() < 2) {
            return str;
        }
        String strBegin;
        if (str.startsWith("pi")) {
            strBegin = "3.14";
            str = strBegin + str.substring(2);
        }
        strBegin = str.substring(0, 1);
        return strBegin + changePi(str.substring(1));
    }
}

/*
Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".

changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p"
 */
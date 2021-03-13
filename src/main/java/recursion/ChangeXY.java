package recursion;

public class ChangeXY {
    
    public String changeXY(String str) {
    
        if (str.length() == 0) {
            return "";
        }
        char x = str.charAt(0);
        if (str.startsWith("x")) {
            x = 'y';
            str = x + str.substring(1);
        }
        return x + changeXY(str.substring(1));
        
        //return str.replace('x', 'y');
    }
}

/*
Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.

changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"
 */
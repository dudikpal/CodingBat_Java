package string1;

public class WithoutEnd2 {
    public String withouEnd2(String str) {
        if (str.length() < 3) {
            return "";
        } else {
            return str.substring(1, str.length() - 1);
        }
    }

}
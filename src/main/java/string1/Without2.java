package string1;

public class Without2 {
    public String without2(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.endsWith(str.substring(0, 2))) {
            return str.substring(2);
        }
        return str;
    }
}

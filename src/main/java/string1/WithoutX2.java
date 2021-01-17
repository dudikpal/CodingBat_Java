package string1;

public class WithoutX2 {
    public String withoutX2(String str) {
        int length = str.length();
        if (length > 1 && str.charAt(1) == 'x') {
            str = str.charAt(0) + str.substring(2, length);
            length--;
        }
        if (str.startsWith("x")) {
            str = str.substring(1, length);
        }
        return str;
    }
}

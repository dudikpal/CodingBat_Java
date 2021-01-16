package string1;

public class ExtraFront {
    public String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        }
        return str.substring(0, 2).repeat(3);
    }

}

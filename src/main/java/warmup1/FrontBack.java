package warmup1;

public class FrontBack {
    public String frontBack(String str) {
        if (str.length() == 0) {
            return "";
        }
        String startChar = String.valueOf(str.charAt(0));
        String endChar = String.valueOf(str.charAt(str.length() - 1));
        int length = str.length();
        return new StringBuilder().append(str).replace(0, 1, endChar).replace(length - 1, length, startChar).toString();
    }
}

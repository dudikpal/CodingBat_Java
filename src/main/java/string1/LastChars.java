package string1;

public class LastChars {
    public String lastChars(String a, String b) {
        if (a.length() == 0 && b.length() != 0) {
            return "@" + b.substring(b.length() - 1);
        } else if (a.length() != 0 && b.length() == 0) {
            return a.charAt(0) + "@";
        } else if (a.length() == 0) {
            return "@@";
        } else {
            return a.charAt(0) + b.substring(b.length() - 1);
        }
    }

}

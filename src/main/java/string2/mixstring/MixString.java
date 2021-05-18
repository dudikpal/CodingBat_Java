package string2.mixstring;

public class MixString {

    public String mixString(String a, String b) {

        int minLength = Math.min(a.length(), b.length());

        String result = "";
        for (int i = 0; i < minLength; i++) {
            result = result + a.charAt(i) + b.charAt(i);
        }
        if (a.length() == minLength) {
            result += b.substring(minLength);
        } else {
            result += a.substring(minLength);
        }
        return result;
    }
}

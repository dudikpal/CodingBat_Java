package string1;

public class DeFront {
    public String deFront(String str) {
        StringBuilder sb = new StringBuilder();
        if (str.charAt(0) == 'a') {
            sb.append(str.charAt(0));
        }
        if (str.charAt(1) == 'b') {
            sb.append(str.charAt(1));
        }
        if (str.length() < 3) {
            return sb.toString();
        }
        return sb.append(str.substring(2)).toString();
    }
}

/*
Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
 */
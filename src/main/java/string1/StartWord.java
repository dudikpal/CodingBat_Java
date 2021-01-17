package string1;

public class StartWord {
    public String startWord(String str, String word) {
        if (str.length() == 0) {
            return "";
        }
        if (word.length() == 1) {
            return String.valueOf(str.charAt(0));
        }
        if (str.substring(1).startsWith(word.substring(1))) {
            return str.substring(0, word.length());
        }
        return "";
    }
}

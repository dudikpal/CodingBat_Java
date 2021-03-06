package string2.repeatseparator;

public class RepeatSeparator {

    public String repeatSeparator(String word, String sep, int count) {

        if (count == 0) {
            return "";
        }
        String result = word;
        for (int i = 1; i < count; i++) {
            result += sep + word;
        }
        return result;
    }

}

package string2.plusout;

public class PlusOut {

    public String plusOut(String str, String word) {


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String part = word;
            if (!str.substring(i).startsWith(word)) {
                part = "+";
            } else {
                i += word.length() - 1;
            }
            sb.append(part);
        }
        return sb.toString();
    }
}

package string2.doublechar;

public class DoubleChar {

    public String doubleChar(String str) {

        StringBuilder sb = new StringBuilder();
        for (char letter : str.toCharArray()) {
            sb.append(letter).append(letter);
        }
        return sb.toString();
    }
}

package string2.onetwo;

public class OneTwo {

    public String oneTwo(String str) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() - 2; i += 3) {
            sb.append(str.substring(i + 1, i + 3))
                    .append(str.charAt(i));
        }
        return sb.toString();
    }
}

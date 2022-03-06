package string3.countTriple;

public class CountTriple {

    public int countTriple(String str) {

        int count = 0;
        String[] chars = str.split("");

        for (int i = 0; i < str.toCharArray().length - 2; i++) {

            if (chars[i].equals(chars[i + 1]) && chars[i].equals(chars[i + 2])) {

                count++;
            }
        }

        return count;
    }
}

package string3.countYZ;

public class CountYZ {

    public int countYZ(String str) {

        String[] words = str.split(" ");
        int count = 0;
        for (String word : words) {
            if (word.endsWith("z") || word.endsWith("y")) {
                count++;
            }
        }
        return count;
    }

}

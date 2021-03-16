package warmup2.stringmatch;

public class StringMatch {
    
    public int stringMatch(String a, String b) {
    
        int length = Math.min(a.length(), b.length());
        int counter = 0;
        for (int i = 0; i < length - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                counter++;
            }
        }
        return counter;
    }
}

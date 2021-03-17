package warmup2.altpairs;

public class AltPairs {
    
    public String altPairs(String str) {
    
        String result = "";
        for (int i = 0; i < str.length(); i += 4) {
            int endIndex = i + 2;
            if (endIndex > str.length()) {
                endIndex = i + 1;
            }
            result += str.substring(i, endIndex);
        }
        return result;
    }
}

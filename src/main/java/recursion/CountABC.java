package recursion;

public class CountABC {
    
    public int countAbc(String str) {
    
        if (str.length() < 3) {
            return 0;
        }
        int counter = 0;
        if (str.startsWith("abc") || str.startsWith("aba")) {
            counter = 1;
        }
        return counter + countAbc(str.substring(1));
    }
}

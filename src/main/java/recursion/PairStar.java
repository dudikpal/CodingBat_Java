package recursion;

public class PairStar {
    
    public String pairStar(String str) {
    
        if (str.length() < 2) {
            return str;
        }
        char firstLetter = str.charAt(0);
        char secondLetter = str.charAt(1);
        String starter = "" + firstLetter;
        if (firstLetter == secondLetter) {
            starter = firstLetter + "*";
        }
        return starter + pairStar(str.substring(1));
    }
}

package warmup1;

public class BackAround {
    public String backAround(String str) {
        String lastLetter = String.valueOf(str.charAt(str.length() - 1));
        return new StringBuilder().append(str).insert(0, lastLetter).append(lastLetter).toString();
    }
}

/*
Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
 */
package string1;

public class FirstHalf {
    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

}

/*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
 */
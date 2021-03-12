package warmup1;

public class Front22 {
    public String front22(String str) {
        if (str.length() < 2) {
            return new StringBuilder().append(str).append(str).append(str).toString();
        }
        String firstChars = str.substring(0, 2);
        return new StringBuilder().append(str).insert(0, firstChars).append(firstChars).toString();

    }
}

/*
Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
 */
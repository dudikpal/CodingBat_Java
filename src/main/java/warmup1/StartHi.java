package warmup1;

public class StartHi {

    public final String STARTWITH = "hi";

    public boolean startHi(String str) {
        return str.startsWith(STARTWITH);
    }
}


/*
Given a string, return true if the string starts with "hi" and false otherwise.

startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
 */
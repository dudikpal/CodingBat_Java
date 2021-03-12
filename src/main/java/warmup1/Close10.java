package warmup1;

public class Close10 {
    public int close10(int a, int b) {
        return (a + b) / 2.0 == 10 ? 0 : (a + b) / 2.0 < 10 ? Math.max(a, b) : Math.min(a, b);
    }

}

/*
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
 */
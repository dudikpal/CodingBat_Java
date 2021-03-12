package warmup1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntMax {
    public int intMax(int a, int b, int c) {
        return Arrays.stream(new int[]{a, b, c}).max().getAsInt();

    }
}

/*
Given three int values, a b c, return the largest.

intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
 */
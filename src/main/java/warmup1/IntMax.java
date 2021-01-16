package warmup1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntMax {
    public int intMax(int a, int b, int c) {
        return Arrays.stream(new int[]{a, b, c}).max().getAsInt();

    }
}

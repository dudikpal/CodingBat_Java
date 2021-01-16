package warmup1;

public class Close10 {
    public int close10(int a, int b) {
        return (a + b) / 2.0 == 10 ? 0 : (a + b) / 2.0 < 10 ? Math.max(a, b) : Math.min(a, b);
    }

}

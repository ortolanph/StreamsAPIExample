import java.util.stream.LongStream;

public class MyStreamedMath {
    public static long factorial(int n) {
        if(n > 20 || n < 0) throw new IllegalArgumentException("%d must be 0 < n <= 20");
        return LongStream.rangeClosed(2, n).reduce(1, (a, b) -> a * b);
    }

    public static long exponential(int b, int e) {
        return LongStream.rangeClosed(1, e).reduce(1, (k, g) -> k * b);
    }
}

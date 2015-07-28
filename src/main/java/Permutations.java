import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Permutations {
    public static <T> List<T> permutation(long no, List<T> items) {
        return permutationHelper(no,
                new LinkedList<>(Objects.requireNonNull(items)),
                new ArrayList<T>());
    }

    private static <T> List<T> permutationHelper(long no, LinkedList<T> in, List<T> out) {
        if (in.isEmpty()) return out;
        long subFactorial = MyStreamedMath.factorial(in.size() - 1);
        out.add(in.remove((int) (no / subFactorial)));
        return permutationHelper((int) (no % subFactorial), in, out);
    }

    @SafeVarargs
    @SuppressWarnings("varargs") // Creating a List from an array is safe
    public static <T> Stream<Stream<T>> of(T... items) {
        List<T> itemList = Arrays.asList(items);
        return LongStream.range(0, MyStreamedMath.factorial(items.length))
                .mapToObj(no -> permutation(no, itemList).stream());
    }

    public static <T> void printThreadInfo(Stream<T> s) {
        System.out.println(Thread.currentThread().getName() + " handles " + s.collect(Collectors.toList()));
    }
}

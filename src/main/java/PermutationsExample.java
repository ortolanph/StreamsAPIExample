import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class PermutationsExample {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("A", "B", "C", "D", "E", "F", "G");

        long permutations = MyStreamedMath.factorial(items.size());
        System.out.printf("%s can be combined in %d different ways:\n", items.toString(), permutations);

        LongStream.range(0, permutations).forEachOrdered(i -> {
            System.out.println(i + ": " + Permutations.permutation(i, items));
        });

        Permutations.of("A", "B", "C", "D", "E")
                .map(s -> s.collect(Collectors.toList()))
                .forEachOrdered(System.out::println);

        Permutations.of("A", "B", "C", "D")
                .flatMap(Function.identity())
                .forEachOrdered(System.out::print);

        Permutations.of("A", "B", "C", "D", "E", "F", "G")
                .forEach(Permutations::printThreadInfo);

        Permutations.of("A", "B", "C", "D", "E", "F", "G")
                .parallel()
                .forEach(Permutations::printThreadInfo);

        System.out.println(
                Permutations.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)
                        .findFirst()
                        .get()
                        .collect(Collectors.toList())
        );
    }
}

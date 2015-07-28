import static java.util.stream.Collectors.*;

public class MyMorning {
    public static void main(String[] args) {

        Permutations.of(
                "Get up",
                "Bath",
                "Check personal mails",
                "Brush teeths",
                "Eat breakfast",
                "Get dressed",
                "Find wallet",
                "Dress ring",
                "Watching a part of a movie",
                "Wait for wife to call"
        )
                .parallel()
                .map(s -> s.collect(toList()))
                .forEach(System.out::println);
    }
}

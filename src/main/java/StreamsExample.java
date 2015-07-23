import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsExample {
    public static void main(String[] args) {
        System.out.println("[exemplo name='Primeiro Exemplo']");
        IntStream.range(0, 10)
                .forEach(value -> System.out.println(value));
        System.out.println("[/exemplo]");

        System.out.println("[exemplo name='Segundo Exemplo']");
        IntStream.range(0, 5)
                .forEach(System.out::println);
        System.out.println("[/exemplo]");


        List<Integer> list = IntStream.range(1, 100)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("[exemplo name='Terceiro Exemplo' result='" + list.stream().count() + "'/]");

        Double average = list.stream()
                .collect(Collectors.averagingInt(item -> item));
        System.out.println("[exemplo name='Quarto Exemplo' result='" + average + "'/]");

        IntSummaryStatistics intSummaryStatistics = list.stream()
                .collect(Collectors.summarizingInt(value -> value));

        System.out.println("[exemplo name='Quinto Exemplo' result='" + intSummaryStatistics + "'/]");

        Map<Integer, Integer> map = list.stream()
                .collect(Collectors.toMap(p -> p, q -> q * 3));
        System.out.println("[exemplo name='Sexto Exemplo' result='" + map + "'/]");

        Map<Integer, Integer> mapTeams = list.stream()
                .collect(Collectors.toMap(p -> p, q -> (q * (q -1))/2 ));
        System.out.println("[exemplo name='Sexto Exemplo Modificado' result='" + mapTeams + "'/]");

        System.out.println("[exemplo name='Sétimo Exemplo']");
        List<Integer> randomInts = new Random().ints(-100, 100).limit(250).boxed().collect(Collectors.toList());
        Optional<Integer> max = randomInts.stream().reduce(Math::max);
        max.ifPresent(System.out::println);
        Optional<Integer> min = randomInts.stream().reduce(Math::min);
        min.ifPresent(System.out::println);
        System.out.println("[/exemplo]");

        System.out.println("[exemplo name='Oitavo Exemplo']");
        String[] names = {"Fred Edwards",
                "Anna Cox",
                "Deborah Patterson",
                "Ruth Torres",
                "Shawn Powell",
                "Rose Thompson",
                "Rachel Barnes",
                "Eugene Ramirez",
                "Earl Flores",
                "Janice Reed",
                "Sarah Miller",
                "Patricia Kelly",
                "Carl Hall",
                "Craig Wright",
                "Martha Phillips",
                "Thomas Howard",
                "Steve Martinez",
                "Diana Bailey",
                "Kathleen Hughes",
                "Russell Anderson",
                "Theresa Perry"};

        long c = Arrays.asList(names)
                .stream()
                .filter(s -> s.startsWith("C"))
                .count();

        System.out.println(c);
        Arrays.asList(names)
                .stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
        System.out.println("[/exemplo]");


    }
}

import java.util.*;
import java.util.stream.Collectors;

public class StreamClassExample {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Elijah", 15));
        people.add(new Person("Tommy", 15));
        people.add(new Person("Harry", 14));
        people.add(new Person("Peter", 25));
        people.add(new Person("Jack", 25));
        people.add(new Person("Alfred", 10));
        people.add(new Person("John", 45));
        people.add(new Person("Joshua", 29));
        people.add(new Person("Mark", 27));
        people.add(new Person("Antony", 55));
        people.add(new Person("Samuel", 10));
        people.add(new Person("Henry", 14));
        people.add(new Person("Richard", 45));
        people.add(new Person("Danny", 10));
        people.add(new Person("Bruce", 55));
        people.add(new Person("Samantha", 29));
        people.add(new Person("Harrison", 27));

        Map<Integer, List<Person>> collect = people
                .stream()
                .collect(Collectors.groupingBy(Person::getAge));

        Double collect1 = people
                .stream()
                .collect(Collectors.averagingInt(Person::getAge));

        System.out.println("------------------------------------------");
        people.stream()
                .map(Person::getName)
                .sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("------------------------------------------");
        people.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("------------------------------------------");
        System.out.println(collect);
        System.out.println("------------------------------------------");
        System.out.println(collect1);
        System.out.println("------------------------------------------");
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class StairClimber {
    public static void main(String[] args) {
        new StairClimber().climb(10000000);
    }

    public void climb(int steps) {
        List<Integer> stair1 = new ArrayList<>();
        List<Integer> stair2 = new ArrayList<>();
        List<Integer> stair3 = new ArrayList<>();
        List<Integer> stair4 = new ArrayList<>();
        List<Integer> stair5 = new ArrayList<>();

        List<Integer> stair = new ArrayList<>();

        int i3 = steps / 5;

        for(int i = 0; i < i3; i ++) {
            stair1.add(Integer.valueOf(i));
            stair2.add(Integer.valueOf(i + i3));
            stair3.add(Integer.valueOf(i + i3 * 2));
            stair4.add(Integer.valueOf(i + i3 * 3));
            stair5.add(Integer.valueOf(i + i3 * 4));
        }

        stair.addAll(stair5);
        stair.addAll(stair2);
        stair.addAll(stair4);
        stair.addAll(stair3);
        stair.addAll(stair1);

        Collections.sort(stair, (i1, i2) -> i1.compareTo(i2));

        stair.stream().parallel().forEach((x) -> stairConsumer().accept(x));
    }

    private Consumer<Integer> stairConsumer() {
        return (x) -> System.out.println(getFoot(x));
    }

    private String getFoot(Integer x) {
        System.out.println(Thread.currentThread().getName());

        return (x % 2 == 0)? "RIGHT": "LEFT";
    }
}

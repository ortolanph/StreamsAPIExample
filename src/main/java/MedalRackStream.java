import java.util.Arrays;
import java.util.List;

public class MedalRackStream {
    public MedalRackStream() {
        MedalRack[] medalCount = new MedalRack[] {
                new MedalRack("Argentina", 11, 22, 25),
                new MedalRack("Brazil", 32, 32, 50),
                new MedalRack("Canada", 64, 56, 53),
                new MedalRack("Chile", 5, 4, 11),
                new MedalRack("Colombia", 25, 9, 27),
                new MedalRack("Cuba", 25, 20, 30),
                new MedalRack("Guatemala", 6, 0, 2),
                new MedalRack("Mexico", 15, 25, 34),
                new MedalRack("United States", 76, 65, 60),
                new MedalRack("Venezuela", 5, 15, 14)
        };

        List<MedalRack> medalBoard = Arrays.asList(medalCount);

        System.out.println("-------------------------------------------------");
        medalBoard.stream()
                .map(MedalRack::getCountry)
                .sorted()
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------");
        medalBoard.stream()
                .sorted(new BronzeMedalComparator())
                .sorted(new SilverMedalComparator())
                .sorted(new GoldenMedalComparator())
                .forEach(medalRack -> showMedalInformation(medalRack));
        System.out.println("-------------------------------------------------");
    }

    private void showMedalInformation(MedalRack medalRack) {
        System.out.printf("%s\t%03d\t%03d\t%03d\t%03d\n",
                medalRack.getCountry(),
                medalRack.getGoldenMedal(),
                medalRack.getSilverMedal(),
                medalRack.getSilverMedal(),
                medalRack.getGoldenMedal() + medalRack.getSilverMedal() + medalRack.getSilverMedal());

    }

    public static void main(String[] args) {
        new MedalRackStream();
    }
}

import java.util.Comparator;

public class GoldenMedalComparator implements Comparator<MedalRack> {

    @Override
    public int compare(MedalRack medalRack1, MedalRack medalRack2) {
        if(medalRack1.getGoldenMedal() == medalRack2.getGoldenMedal()) {
            return 0;
        } else {
            if(medalRack1.getGoldenMedal() > medalRack2.getGoldenMedal()) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}

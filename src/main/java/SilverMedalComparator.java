import java.util.Comparator;

public class SilverMedalComparator implements Comparator<MedalRack> {

    @Override
    public int compare(MedalRack medalRack1, MedalRack medalRack2) {
        if(medalRack1.getSilverMedal() == medalRack2.getSilverMedal()) {
            return 0;
        } else {
            if(medalRack1.getSilverMedal() > medalRack2.getSilverMedal()) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}

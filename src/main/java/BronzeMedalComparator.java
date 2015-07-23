import java.util.Comparator;

public class BronzeMedalComparator implements Comparator<MedalRack> {

    @Override
    public int compare(MedalRack medalRack1, MedalRack medalRack2) {
        if(medalRack1.getBronzeMedal() == medalRack2.getBronzeMedal()) {
            return 0;
        } else {
            if(medalRack1.getBronzeMedal() > medalRack2.getBronzeMedal()) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}

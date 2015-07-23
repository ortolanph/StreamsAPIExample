import java.util.Comparator;

public class MedalRack {
    private final String country;
    private final int goldenMedal;
    private final int silverMedal;
    private final int bronzeMedal;

    public MedalRack(String country, int goldenMedal, int silverMedal, int bronzeMedal) {
        this.country = country;
        this.goldenMedal = goldenMedal;
        this.silverMedal = silverMedal;
        this.bronzeMedal = bronzeMedal;
    }

    public String getCountry() {
        return country;
    }

    public int getGoldenMedal() {
        return goldenMedal;
    }

    public int getSilverMedal() {
        return silverMedal;
    }

    public int getBronzeMedal() {
        return bronzeMedal;
    }
}

import java.util.*;

public class Reel {

    public enum ReelType {
        CHERRIES("Cherries", 0),
        ORANGES("Oranges", 1),
        PLUMS("Plums", 2),
        BELLS("Bells", 3),
        MELONS("Melons", 4),
        BARS("Bars", 5);

        private String name;
        private int id;

        ReelType(String name, Integer id) {
            this.name = name;
            this.id = id;
        }

        public String toString() {
            return this.name;
        }

        public int getId() {
            return this.id;
        }
    }

    public static final int NUMOFREELS = 3;

    // Method for generating random reel
    public static ReelType generateRandomReel() {
        return ReelType.values()[randInt(0, ReelType.values().length - 1)];
    }

    private static int randInt(int min, int max) {
        Random rn = new Random();

        return rn.nextInt(max-min+1) + min;
    }

    // Method for calculating profit
    public static int calculateProfitPercentage(List<ReelType> reels) {
        Map<ReelType, Integer> freq = new HashMap();
        for(ReelType r : reels) {
            freq.put(r, 0);
        }
        int highestFreq = 0;
        for(ReelType r : reels) {
            Integer f = freq.get(r);
            freq.put(r, ++f);
            if(f > highestFreq) highestFreq = f;
        }
        if(highestFreq == 1) return 0;
        else return highestFreq;
    }
}
package hexlet.code;

import java.util.Random;

public class Utils {
    public static int generateNumber(int min, int max) {
        Random rn = new Random();
        return min + rn.nextInt(max - min);
    }
}

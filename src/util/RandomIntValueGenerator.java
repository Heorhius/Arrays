package util;

public class RandomIntValueGenerator {

    private static final int MULTIPLIER = 10;

    public static int getRandomValue() {
        return ((int) (Math.random() * 10));
    }
}

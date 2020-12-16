package logic;

public class ArrayMaxValueSearch {

    public static int getMaxValue(final int[] array) {
        int maxValue = array[0];

        for (int value : array) {
            if (maxValue < value) {
                maxValue = value;
            }
        }

        return maxValue;
    }
}

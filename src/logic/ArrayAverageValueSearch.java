package logic;

public class ArrayAverageValueSearch {

    public static double searchAverageValue(final int[] array) {
        int summ = 0;
        for (int value : array) {
            summ += value;
        }
        return ((double) summ / array.length);
    }
}
